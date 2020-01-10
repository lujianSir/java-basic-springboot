package com.item.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.tool.Result;

public interface FileService {
	
	
	//文件信息上传
	public Result<?> fileUpload(MultipartFile file,HttpServletRequest request,String catalog, int role);
	
	//通过id删除文件
	public  Result<?> fileDelete(String id);
		
	//模型信息录入、修改
	public Result<?> modelUpload(ModelBean model);
	
	//根据文件名查询出数据信息
	public Result<?> fileinfoQuery(String filename);
	
	//文件信息删除
	public Result<?> fileinfoDelete(String filename);
	
	//查询商城中的所有数据
	public Result<?> webStoreQuery();
	
	//查询商城所有的数据(带参数类型)
	public Result<?> queryModels(ModelBean modelBean,Page page,String startPrice ,String endPrice,String orderBy);
	
	//通过ID查询模型的信息
	public Result<?> queryModelById(String  mid,String uid);
	
}
