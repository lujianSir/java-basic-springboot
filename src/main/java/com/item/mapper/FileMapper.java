package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.FileBean;
import com.item.entity.ModelBean;

@Repository
public interface FileMapper {
	
	//文件信息录入数据库
	public void fileinfoAdd(FileBean file);
	
	//模型信息录入
	public void modelinfoAdd(ModelBean model);
	
	//根据文件名查询出数据信息
	public List<FileBean> fileinfoQuery(String filename);
	
	//删除文件信息
	public void fileinfoDelete(int id);
	
	//商城主页信息模型加载
	public List<FileBean> webStoreQuery();
	
}
