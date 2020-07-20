package com.item.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.FileBean;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.entity.ResourceInfo;
import com.item.entity.Role;
import com.item.entity.StarClass;
import com.item.entity.UserBean;
import com.item.mapper.FileMapper;
import com.item.mapper.RoleMapper;
import com.item.mapper.TagMapper;
import com.item.mapper.UserMapper;
import com.item.tool.CommonServerIP;
import com.item.tool.JavaTool;
import com.item.tool.Result;

@Service
@Transactional
public class FileServiceImpl implements FileService {

	private static final Logger LOG = LoggerFactory.getLogger(FileServiceImpl.class);

	@Autowired
	private FileMapper fileMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private TagMapper tagMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Value("${disk-path}")
	private String rootPath;

	/**
	 * 文件上传
	 */
	@Override
	public Result<?> fileUpload(MultipartFile file, HttpServletRequest request, String catalog, int role) {

		if (!file.isEmpty()) {
			try {
				// 文件存放服务端的位置
				File dir = null;

				// long now = System.currentTimeMillis();

				// String filesuffix =
				// file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

				// String filename = now + filesuffix;
				String filename = file.getOriginalFilename();

				FileBean fileBean = fileMapper.selectFileById(filename);

				if (fileBean != null) {
					return Result.error(501, "文件名重复");
				} else {
					String newrootPath = System.getProperty("user.dir") + "/upload";

					System.out.println(newrootPath);

					// 0代表前台 1代表模型端
					switch (role) {
					case 0:
						if (catalog.equals("模型描述")) {
							dir = new File(newrootPath + File.separator + catalog);
						} else {
							dir = new File(newrootPath + File.separator + "web" + File.separator + catalog);
						}
						break;
					case 1:
						dir = new File(newrootPath + File.separator + "model" + File.separator + catalog);
						break;
					default:
						break;
					}
					if (!dir.exists()) {
						dir.mkdirs();
					}

					String filePath = dir.getAbsolutePath() + File.separator + filename;

					// 写文件到服务器
					File serverFile = new File(filePath);
					file.transferTo(serverFile);

					// 录入文件信息
					FileBean fileinfo = new FileBean();
					fileinfo.setCatalog(catalog);
					fileinfo.setFileurl(filePath);
					fileinfo.setRole(role);
					if (catalog.equals("模型描述")) {
						String str = "/image/模型描述/" + filename;
						filename = str;
					}
					fileinfo.setId(filename);
					fileinfo.setUploadtime(JavaTool.getCurrent());
					fileMapper.fileinfoAdd(fileinfo);
					return Result.success(filename);
				}

			} catch (Exception e) {
				LOG.error(e.getMessage());
				return Result.error(500, "服务端错误");
			}
		} else {
			return Result.error(50010, "请上传文件");
		}
	}

	/**
	 * 模型上传
	 * 
	 */
	@Override
	public Result<?> modelUpload(ModelBean model) {

		try {
			// 模型信息修改
			if (model.getMid() > 0) {
				fileMapper.modelInfoUpdate(model);
			} else {
				PakInfo pakInfo = new PakInfo();
				String fileMode = model.getFileModel();
				String pic = model.getFilePics();
				if (!pic.equals("")) {
					String[] pics = pic.split(",");
					pic = pics[0];
				}
				String pakname = fileMode.substring(0, fileMode.indexOf("."));
				pakInfo.setPakgamepath("/Game/DPC/Item/" + pakname);
				pakInfo.setPakname(pakname);
				pakInfo.setPakdownloadpath(
						"http://" + CommonServerIP.CURRENT_SERVER + "/file/download?fileModel=" + fileMode);
				pakInfo.setType("Blueprint");
				pakInfo.setPakpicturepath("http://" + CommonServerIP.CURRENT_SERVER + "/file/download?filepic=" + pic);
				String classname = "";
				if (!model.getResource_one().equals("")) {
					classname = model.getResource_one();
				}
				if (!model.getResource_two().equals("")) {
					classname = model.getResource_two();
				}
				if (!model.getResource_three().equals("")) {
					classname = model.getResource_three();
				}
				if (!model.getResource_four().equals("")) {
					classname = model.getResource_four();
				}
				ResourceInfo resourceInfo = new ResourceInfo();
				resourceInfo.setId(Integer.parseInt(classname));
				resourceInfo = tagMapper.selectResourceInfoById(resourceInfo.getId());
				pakInfo.setClassname(resourceInfo.getRname());
				pakInfo.setDisplayname(model.getModelname());
				fileMapper.insertPakInfo(pakInfo);
				// 模型信息录入
				Role role = roleMapper.queryRoleByUserId(model.getUserid());
				if (role.getId() == 1 || role.getId() == 31) {
					model.setExamine(1);
					model.setExaminepeople(model.getUserid());
					model.setExaminetime(JavaTool.getCurrent());
				} else {
					model.setExamine(0);
				}
				fileMapper.modelinfoAdd(model);
			}
			return Result.success();
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端错误");
		}
	}

	@Override
	public Result<?> fileinfoQuery(String filename) {
		return Result.success(fileMapper.fileinfoQuery(filename));
	}

	@Override
	public Result<?> fileinfoDelete(String filename) {
		try {
			FileBean fileinfo = new FileBean();
			// 根据名称查询数据,获取文件路径
			fileinfo = fileMapper.fileinfoQuery(filename).get(0);
			// 删除文件
			File file = new File(fileinfo.getFileurl());
			if (file.exists()) {
				file.delete();
			}
			// 删除记录
			fileMapper.fileinfoDelete(fileinfo.getId());
			return Result.success();
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端错误");
		}
	}

	@Override
	public Result<?> webStoreQuery() {
		try {
			// 对返回数据的地址做相应的处理 方便前端做加载
			List<FileBean> list = new ArrayList<FileBean>();
			List<String> filesurl = new ArrayList<String>();
			String fileurl = "";
			for (int i = 0; i < list.size(); i++) {
				// 此处截取数据信息

				fileurl = list.get(i).getFileurl();

				filesurl.add(fileurl);
			}
			return Result.success(filesurl);
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端错误");
		}
	}

	@Override
	public Result<?> fileDelete(String id, String mid) {
		// TODO Auto-generated method stub
		if (mid != null && !mid.equals("")) {
			List<String> list = new ArrayList<String>();
			ModelBean modelBean = fileMapper.queryModelById(Integer.parseInt(mid));
			String filepics = modelBean.getFilePics();
			if (filepics != null && !filepics.equals("")) {
				String[] pics = filepics.split(",");
				for (int i = 0; i < pics.length; i++) {
					String pic = pics[i];
					list.add(pic);
				}
			}

			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(id)) {
					list.remove(j);
				}
			}
			if (list.size() > 0) {
				filepics = StringUtils.strip(list.toString(), "[]");
			}
			ModelBean model = new ModelBean();
			model.setMid(Integer.parseInt(mid));
			model.setFilePics(filepics);
			fileMapper.modelInfoUpdate(model);
		}

		try {
			FileBean fileinfo = new FileBean();
			// 根据名称查询数据,获取文件路径
			fileinfo = fileMapper.selectFileById(id);
			// 删除文件
			File file = new File(fileinfo.getFileurl());
			if (file.exists()) {
				file.delete();
			}

			// 删除记录
			fileMapper.fileinfoDelete(fileinfo.getId());
			return Result.success(fileinfo.getId());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端错误");
		}
	}

	@Override
	public Result<?> queryModels(ModelBean modelBean, Page page, String startPrice, String endPrice, String orderBy) {
		// TODO Auto-generated method stub
		Double star = null;
		Double end = null;
		if (startPrice != null && !startPrice.equals("")) {
			star = Double.parseDouble(startPrice);
		} else {
			star = -0.1;
		}
		if (endPrice != null && !endPrice.equals("")) {
			end = Double.parseDouble(endPrice);
		} else {
			end = -0.1;
		}

		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ModelBean> list = fileMapper.queryModels(modelBean, star, end, orderBy);
		PageInfo<ModelBean> pageInfo = new PageInfo<ModelBean>(list);
		return Result.success(pageInfo);
	}

	@Override
	public Result<?> queryModelById(String mid, String uid) {
		// TODO Auto-generated method stub
		int num = 0;
		ModelBean modelBean = new ModelBean();
		if (mid != null && !mid.equals("")) {
			num = Integer.parseInt(mid);
		}
		if (uid != null && !uid.equals("")) {
			modelBean = fileMapper.queryModelByIdAndUserId(num, uid);
			if (modelBean == null) {
				modelBean = fileMapper.queryModelById(num);
				modelBean.setStatus(0);
			}
		} else {
			modelBean = fileMapper.queryModelById(num);
			modelBean.setStatus(0);
		}
		modelBean.setCreatTimeName(modelBean.getCreatTime());
		return Result.success(modelBean);
	}

	@Override
	public List<ModelBean> queryModelsByAdmin(ModelBean modelBean) {
		// TODO Auto-generated method stub
		UserBean userBean = userMapper.queryByUserId(modelBean.getUserid());
		int roleid = userBean.getRole();
		return fileMapper.queryModelsByAdmin(modelBean, roleid);
	}

	@Override
	public int deleteModelInfoByMid(ModelBean modelBean) {
		// TODO Auto-generated method stub
		return fileMapper.deleteModelInfoByMid(modelBean);
	}

	@Override
	public ModelBean queryModelById(int mid) {
		// TODO Auto-generated method stub
		return fileMapper.queryModelById(mid);
	}

	@Override
	public List<ModelBean> queryModelsExamine(ModelBean modelBean) {
		// TODO Auto-generated method stub
		UserBean userBean = userMapper.queryByUserId(modelBean.getUserid());
		int roleid = userBean.getRole();
		List<ModelBean> list = fileMapper.queryModelsExamine(modelBean, roleid);
		for (int i = 0; i < list.size(); i++) {
			if (roleid == 1 || roleid == 31) {
				list.get(i).setFlag(true);
			} else {
				list.get(i).setFlag(false);
			}
		}
		return list;
	}

	@Override
	public int updateModelInfoById(ModelBean modelBean) {
		// TODO Auto-generated method stub
		ModelBean m = fileMapper.queryModelById(modelBean.getMid());
		int total = m.getDownload() + 1;
		modelBean.setDownload(total);
		fileMapper.updateStarAndDownById(modelBean);
		return total;
	}

	@Override
	public Result<?> insertStarClass(StarClass starClass) {
		// TODO Auto-generated method stub
		ModelBean m = fileMapper.queryModelById(starClass.getMid());
		int startclass = m.getStarclass();
		int newstar = JavaTool.avg(starClass.getStar(), startclass);
		ModelBean model = new ModelBean();
		model.setMid(starClass.getMid());
		model.setStarclass(newstar);
		fileMapper.updateStarAndDownById(model);
		fileMapper.insertStarClass(starClass);
		return Result.success();
	}

}
