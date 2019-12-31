package com.item.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ModelBean;
import com.item.tool.Result;

public interface FileService {
	
	
	//文件信息上传
	public Result<?> fileUpload(MultipartFile file,HttpServletRequest request,String catalog, int role);
	
	//模型信息录入
	public Result<?> modelUpload(ModelBean model);
	
	//根据文件名查询出数据信息
	public Result<?> fileinfoQuery(String filename);
	
	//文件信息删除
	public Result<?> fileinfoDelete(String filename);
	
	//查询商城中的所有数据
	public Result<?> webStoreQuery();
	
}
