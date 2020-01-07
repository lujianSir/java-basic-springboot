package com.item.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.FileBean;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.mapper.FileMapper;
import com.item.tool.Result;

@Service
public class FileServiceImpl implements FileService {

	private static final Logger LOG = LoggerFactory.getLogger(FileServiceImpl.class);

	@Autowired
	private FileMapper fileMapper;

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

				long now = System.currentTimeMillis();

				String filesuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

				String filename = now + filesuffix;

				// 0代表前台 1代表模型端
				switch (role) {
				case 0:
					if(catalog.equals("模型描述")) {
						dir = new File(rootPath+File.separator + catalog);
					}else {
						dir = new File(rootPath + File.separator + "web" + File.separator + catalog);
					}						
					break;
				case 1:
					dir = new File(rootPath + File.separator + "model" + File.separator + catalog);
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
				if(catalog.equals("模型描述")) {
					String str="/image/模型描述/"+filename;
					filename=str;
				}
				fileinfo.setId(filename);
				fileMapper.fileinfoAdd(fileinfo);
				return Result.success(filename);
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
			if(model.getMid()>0) {
				fileMapper.modelInfoUpdate(model);
			}else {
				// 模型信息录入
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
			FileBean fileinfo =  new FileBean();
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
			//对返回数据的地址做相应的处理  方便前端做加载
			List<FileBean> list = new ArrayList<FileBean>();
			List<String> filesurl =  new ArrayList<String>();
			String fileurl = "";
			for(int i = 0 ; i < list.size() ; i++) {
				//此处截取数据信息
				
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
	public Result<?> fileDelete(String id) {
		// TODO Auto-generated method stub
		try {
			FileBean fileinfo =  new FileBean();
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
	public Result<?> queryModels(ModelBean modelBean, Page page, String startPrice, String endPrice,String orderBy) {
		// TODO Auto-generated method stub
		Double star=null;
		Double end=null;
		if(startPrice!=null&& !startPrice.equals("")) {
			star=Double.parseDouble(startPrice);
		}else {
			star=-0.1;
		}
		if(endPrice!=null&& !endPrice.equals("")) {
			end=Double.parseDouble(endPrice);
		}else {
			end=-0.1;
		}
		
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ModelBean>  list=fileMapper.queryModels(modelBean, star, end,orderBy);	
		PageInfo<ModelBean> pageInfo = new PageInfo<ModelBean>(list);				
		return Result.success(pageInfo);
	}

	@Override
	public Result<?> queryModelById(String mid) {
		// TODO Auto-generated method stub
		int num=0;
		if(mid!=null && !mid.equals("")) {
			num=Integer.parseInt(mid);
		}
		ModelBean modelBean =fileMapper.queryModelById(num);		
		return Result.success(modelBean);
	}

}
