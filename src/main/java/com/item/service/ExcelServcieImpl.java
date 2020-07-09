package com.item.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.item.config.FileUploadProperties;
import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;
import com.item.entity.FileBean;
import com.item.entity.ModelBean;
import com.item.entity.PakInfo;
import com.item.entity.ResourceInfo;
import com.item.entity.Role;
import com.item.mapper.ExcelMapper;
import com.item.mapper.FileMapper;
import com.item.mapper.RoleMapper;
import com.item.mapper.TagMapper;
import com.item.tool.CommonServerIP;
import com.item.tool.ExcelUtil;
import com.item.tool.FileUtil;
import com.item.tool.JavaTool;
import com.item.tool.Result;
import com.item.tool.Utils;

@Service
@Transactional
public class ExcelServcieImpl implements ExcelServcie {

	@Autowired
	private ExcelMapper excelMapper;

	@Autowired
	private FileMapper fileMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private TagMapper tagMapper;

	@Override
	public int importExcelInfo(InputStream in, MultipartFile file, ExcelManage excelManage) throws Exception {
		// TODO Auto-generated method stub

		if (!file.isEmpty()) {
			try {
				// 文件存放服务端的位置
				File dir = null;
				String filename = file.getOriginalFilename();
				excelManage.setExcelname(filename);
				String newrootPath = System.getProperty("user.dir") + "/upload";
				System.out.println(newrootPath);
				dir = new File(newrootPath + File.separator + "excel" + File.separator);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String filePath = dir.getAbsolutePath() + File.separator + filename;
				excelManage.setRealpath(filePath);
				// 写文件到服务器
				File serverFile = new File(filePath);
				file.transferTo(serverFile);

			} catch (Exception e) {

			}
		}
		String eid = JavaTool.getUserId();
		excelManage.setEid(eid);
		excelManage.setCreattime(Utils.getCurrent());
		List<List<Object>> listob = ExcelUtil.getBankListByExcel(in, file.getOriginalFilename());
		System.out.println(listob);
		List<ExcelContent> excelContentList = new ArrayList<ExcelContent>();
		for (int i = 0; i < listob.size(); i++) {
			List<Object> ob = listob.get(i);
			int total = ob.size();
			ExcelContent excelContent = new ExcelContent();
			excelContent.setEid(eid);
			if (0 < total) {
				excelContent.setStr1(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (1 < total) {
				excelContent.setStr2(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (2 < total) {
				excelContent.setStr3(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (3 < total) {
				excelContent.setStr4(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (4 < total) {
				excelContent.setStr5(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (5 < total) {
				if (ob.size() > 0) {
					String str6 = "";
					for (int m = 0; m < ob.size(); m++) {
						str6 += ob.get(m);
						if (m < ob.size() - 1) {
							str6 += "  ";
						}
					}
					excelContent.setStr6(str6);
				}

			}
			excelContentList.add(excelContent);
		}

		System.out.println(excelContentList);

		excelMapper.insertExcelContent(excelContentList);
		excelManage.setExcelstatus(1);
		int row = excelMapper.insertExcelManage(excelManage);

		return row;
	}

	@Override
	public List<ExcelManage> queryExcelManage(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		return excelMapper.queryExcelManage(excelManage);
	}

	@Override
	@Cacheable(value = "excelContentList", key = "#excelManage.excelname")
	public List<ExcelContent> queryExcelContentByEid(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		List<ExcelContent> list = excelMapper.queryExcelContentByEid(excelManage);
		return list;
	}

	@Override
	public int deleteExcelByEid(String eid) {
		// TODO Auto-generated method stub
		ExcelManage excelManage = new ExcelManage();
		excelManage.setEid(eid);
		List<ExcelManage> list = excelMapper.queryExcelManage(excelManage);
		String realpath = list.get(0).getRealpath();
		// 删除文件
		File file = new File(realpath);
		if (file.exists()) {
			file.delete();
		}
		excelMapper.deleteExcelContentByEid(eid);
		int row = excelMapper.deleteExcelManageByEid(eid);
		return row;
	}

	@Override
	public int queryExcelManageByExcelname(String excelname) {
		// TODO Auto-generated method stub
		return excelMapper.queryExcelManageByExcelname(excelname);
	}

	@Override
	public List<ExcelManage> queryByTitle(List<String> list) {
		// TODO Auto-generated method stub
		return excelMapper.queryByTitle(list);
	}

	@Override
	public int updateExcelManage(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		return excelMapper.updateExcelManage(excelManage);
	}

	@Override
	public Result<?> uploadZipFilesAndParse(MultipartFile file, String userid) throws Exception {
		// TODO Auto-generated method stub
		// try {
		String filename = file.getOriginalFilename();
		String name = filename.substring(0, filename.indexOf("."));
		String fileType = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase(Locale.US);
		String gettime = Utils.getCurrenttime();
		// 判断文件是不是zip类型
		if (fileType.equals("zip") || fileType.equals("rar")) {
			String desPath = FileUploadProperties.getLocation() + File.separator + gettime;
			// 文件存放服务端的位置
			File dir = null;
			// 下面这三行的代码就是把上传文件copy到服务器，一定不要遗漏了。
			// 遗漏了这个代码，在本地测试环境不会出问题，在服务器上一定会报没有找到文件的错误
			String savePath = FileUploadProperties.getLocation();
			dir = new File(savePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			String filePath = dir.getAbsolutePath() + File.separator + filename;
			File savefile = new File(filePath);
			file.transferTo(savefile);
			FileUtil fileUtil = new FileUtil();
			if (fileType.equals("zip")) {
				// 解压zip文件
				FileUtil.unZip(savefile, desPath, savePath);
			} else {
				FileUtil.unRar(savefile, desPath);
			}
			// 读取文件夹里面的excel文件
			String strPath = desPath + File.separator + name;

			List<File> list = getFileList(strPath);
			File excelFile = list.get(0);
			FileItem item = createFileItem(excelFile, excelFile.getName());
			MultipartFile multipartFile = new CommonsMultipartFile(item);
			System.out.println(list.get(0).getName());
			InputStream in = multipartFile.getInputStream();
			List<List<Object>> listob = ExcelUtil.getBankListByExcel(in, multipartFile.getName());
			String startpath = strPath;
			Map<String, Object> map = insertModelBeans(listob, startpath, userid);
			List<String> message = (List<String>) map.get("message");
			List<ModelBean> models = (List<ModelBean>) map.get("list");
			List<PakInfo> pakInfos = new ArrayList<PakInfo>();
//			FileUtil.clearFiles(filePath);
//			FileUtil.clearFiles(strPath);
			if (message.size() == 0) {
				for (int z = 0; z < models.size(); z++) {
					ModelBean model = models.get(z);
					PakInfo pakInfo = getPakInfo(model);
					pakInfos.add(pakInfo);
				}
				fileMapper.insertModels(models);
				fileMapper.insertPakInfos(pakInfos);
				return Result.success("导入成功");
			} else {
				String result = "";
				for (int i = 0; i < message.size(); i++) {
					result += message.get(i);
					if (i <= message.size() - 1) {
						result += ";";
					}
				}
				return Result.error(502, result);
			}

		} else {
			return Result.error(500, "导入的格式不符合规范");
		}
		// } catch (Exception e) {
		// TODO: handle exception
		// return Result.error(501, "服务器错误，请重新上传");
		// }

	}

	private Map<String, Object> insertModelBeans(List<List<Object>> listob, String obpath, String userid) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> meassages = new ArrayList<String>();
		String message = "";
		String filename = "";
		String startpath = "";
		String endpath = "";
		List<ModelBean> list = new ArrayList<ModelBean>();
		Role role = roleMapper.queryRoleByUserId(userid);
		for (int i = 0; i < listob.size(); i++) {
			List<Object> ob = listob.get(i);
			ModelBean modelBean = new ModelBean();
			if (ob.get(0) != null) {
				modelBean.setModelname(String.valueOf(ob.get(0)));
			}
			if (ob.get(1) != null && !String.valueOf(ob.get(1)).equals("")) {
				System.out.println(String.valueOf(ob.get(1)));
				System.out.println(Double.parseDouble(String.valueOf(ob.get(1))));
				if (isNumeric(String.valueOf(ob.get(1)))) {
					modelBean.setModelprice(Double.parseDouble(String.valueOf(ob.get(1))));
				} else {
					message = "第" + (i + 2) + "行" + ",第2列的数据有问题";
					meassages.add(message);
				}

			}
			if (ob.get(2) != null && !String.valueOf(ob.get(2)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(2)))) {
					modelBean.setUnitprice(Double.parseDouble(String.valueOf(ob.get(2))));
				} else {
					message = "第" + (i + 2) + "行" + ",第3列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(3) != null && !String.valueOf(ob.get(3)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(3)))) {
					if (Integer.parseInt(String.valueOf(ob.get(3))) == 0
							|| Integer.parseInt(String.valueOf(ob.get(3))) == 1) {
						modelBean.setModelstatus(Integer.parseInt(String.valueOf(ob.get(3))));
					} else {
						message = "第" + (i + 2) + "行" + ",第4列的数据有问题";
						meassages.add(message);
					}

				} else {
					message = "第" + (i + 2) + "行" + ",第4列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(4) != null && !String.valueOf(ob.get(4)).equals("")) {
				modelBean.setBuildtype(String.valueOf(ob.get(4)));
			}
			if (ob.get(5) != null && !String.valueOf(ob.get(5)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(5)))) {
					modelBean.setResource_one(String.valueOf(ob.get(5)));
				} else {
					message = "第" + (i + 2) + "行" + ",第6列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(6) != null && !String.valueOf(ob.get(6)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(6)))) {
					modelBean.setResource_two(String.valueOf(ob.get(6)));
				} else {
					message = "第" + (i + 2) + "行" + ",第7列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(7) != null && !String.valueOf(ob.get(7)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(7)))) {
					modelBean.setResource_three(String.valueOf(ob.get(7)));
				} else {
					message = "第" + (i + 2) + "行" + ",第8列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(8) != null && !String.valueOf(ob.get(8)).equals("")) {
				if (isNumeric(String.valueOf(ob.get(8)))) {
					modelBean.setResource_four(String.valueOf(ob.get(8)));
				} else {
					message = "第" + (i + 2) + "行" + ",第9列的数据有问题";
					meassages.add(message);
				}
			}
			if (ob.get(9) != null && !String.valueOf(ob.get(9)).equals("")) {
				filename = String.valueOf(ob.get(9));
				String[] filenames = filename.split(",");
				for (int m = 0; m < filenames.length; m++) {
					String pathname = filenames[m];
					startpath = obpath + File.separator + pathname;
					File file = new File(startpath);
					if (!file.exists()) {
						message = "第" + (i + 2) + "行" + ",第10列的数据有问题";
						meassages.add(message);
					} else {
						endpath = System.getProperty("user.dir") + "/upload" + File.separator + "web" + File.separator
								+ "模型封面";
						moveFile(startpath, endpath, pathname, "模型封面");
					}

				}
				modelBean.setFilePics(filename);
			}
			if (ob.get(10) != null && !String.valueOf(ob.get(10)).equals("")) {
				filename = String.valueOf(ob.get(10));
				String[] filenames = filename.split(",");
				if (filenames.length > 1) {
					message = "第" + (i + 2) + "行" + ",第11列的数据有问题";
					meassages.add(message);
				} else {
					startpath = obpath + File.separator + filename;
					File file = new File(startpath);
					if (!file.exists()) {
						message = "第" + (i + 2) + "行" + ",第11列的数据有问题";
						meassages.add(message);
					} else {
						endpath = System.getProperty("user.dir") + "/upload" + File.separator + "web" + File.separator
								+ "模型源文件";
						moveFile(startpath, endpath, filename, "模型源文件");
						modelBean.setFileModel(filename);
					}

				}

			}
			if (ob.get(11) != null && !String.valueOf(ob.get(11)).equals("")) {
				modelBean.setMdescribe(String.valueOf(ob.get(11)));

			}
			if (role.getId() == 1 || role.getId() == 31) {
				modelBean.setExamine(1);
				modelBean.setExaminepeople(userid);
				modelBean.setExaminetime(JavaTool.getCurrent());
			} else {
				modelBean.setExamine(0);
			}
			modelBean.setCreatTime(JavaTool.getCurrent());
			modelBean.setUserid(userid);
			list.add(modelBean);
		}
		map.put("message", meassages);
		map.put("list", list);
		return map;
	}

	// 判断字符串是是不是数字
	public boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]+.*[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	private void moveFile(String startpath, String endpath, String filename, String catalog) {
		// 源文件路径
		File startFile = new File(startpath);
		// 目的目录路径
		File endDirection = new File(endpath);
		// 如果目的目录路径不存在，则进行创建
		if (!endDirection.exists()) {
			endDirection.mkdirs();
		}
		// 目的文件路径=目的目录路径+源文件名称
		File endFile = new File(endDirection + File.separator + startFile.getName());
		try {
			// 调用File类的核心方法renameTo
			if (startFile.renameTo(endFile)) {
				// 录入文件信息
				FileBean fileinfo = new FileBean();
				fileinfo.setCatalog(catalog);
				fileinfo.setFileurl(endDirection + File.separator + startFile.getName());
				fileinfo.setRole(0);
				if (catalog.equals("模型描述")) {
					String str = "/image/模型描述/" + filename;
					filename = str;
				}
				fileinfo.setId(filename);
				fileinfo.setUploadtime(JavaTool.getCurrent());
				fileMapper.fileinfoAdd(fileinfo);
				System.out.println("文件移动成功！目标路径：{" + endFile.getAbsolutePath() + "}");
			} else {
				System.out.println("文件移动失败！起始路径：{" + startFile.getAbsolutePath() + "}");
			}
		} catch (Exception e) {
			System.out.println("文件移动出现异常！起始路径：{" + startFile.getAbsolutePath() + "}");
		}

	}

	// 将file转为fileitem
	private FileItem createFileItem(File file, String fieldName) {
		FileItemFactory factory = new DiskFileItemFactory(16, null);
		FileItem item = factory.createItem(fieldName, "text/plain", true, file.getName());
		int bytesRead = 0;
		byte[] buffer = new byte[8192];
		try {
			FileInputStream fis = new FileInputStream(file);
			OutputStream os = item.getOutputStream();
			while ((bytesRead = fis.read(buffer, 0, 8192)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			os.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return item;
	}

	// 获取文件夹excel表格
	public static List<File> getFileList(String strPath) {
		List<File> filelist = new ArrayList<File>();
		File dir = new File(strPath);
		File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String fileName = files[i].getName();
				if (files[i].isDirectory()) { // 判断是文件还是文件夹
					getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
				} else if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) { // 判断文件名是否以.avi结尾
					String strFileName = files[i].getAbsolutePath();
					System.out.println("---" + strFileName);
					filelist.add(files[i]);
				} else {
					continue;
				}
			}

		}
		return filelist;
	}

	// 获取PakInfo
	public PakInfo getPakInfo(ModelBean model) {
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
		pakInfo.setPakdownloadpath("http://" + CommonServerIP.CURRENT_SERVER + "/file/download?fileModel=" + fileMode);
		pakInfo.setType("Blueprint");
		pakInfo.setPakpicturepath("http://" + CommonServerIP.CURRENT_SERVER + "/file/download?filepic=" + pic);
		String classname = "";
		if (model.getResource_one() != null && !model.getResource_one().equals("")) {
			classname = model.getResource_one();
		}
		if (model.getResource_two() != null && !model.getResource_two().equals("")) {
			classname = model.getResource_two();
		}
		if (model.getResource_three() != null && !model.getResource_three().equals("")) {
			classname = model.getResource_three();
		}
		if (model.getResource_four() != null && !model.getResource_four().equals("")) {
			classname = model.getResource_four();
		}
		ResourceInfo resourceInfo = new ResourceInfo();
		resourceInfo.setId(Integer.parseInt(classname));
		resourceInfo = tagMapper.queryresourceInfoById(resourceInfo);
		pakInfo.setClassname(resourceInfo.getRname());
		pakInfo.setDisplayname(model.getModelname());
		return pakInfo;
	}
}
