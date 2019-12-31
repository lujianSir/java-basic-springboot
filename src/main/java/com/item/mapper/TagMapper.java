package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.TagBean;

@Repository
public interface TagMapper {
	
	//判断标签是否存在
	public int tagExist(String tagname);
	
	//根据标签名称模糊查询
	public List<TagBean> tagQuery(String tagname);
	
	//查询出标签与它的子标签
	public List<TagBean> tagSubquery(String tagname);
	
	//查询出所有标签信息
	public List<TagBean> tagAllQuery();
	
	
}
