package com.item.service;

import com.item.tool.Result;

public interface TagService {
	
	//判断标签是否存在
	public boolean tagExist(String tagname);
	
	//根据标签名称模糊查询
	public Result<?> tagQuery(String tagname);
	
	//查询出标签与它的子标签
	public Result<?> tagSubquery(String tagname);
	
	//查询出所有标签信息
	public Result<?> tagAllQuery();

}
