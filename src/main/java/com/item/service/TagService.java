package com.item.service;

import com.item.entity.ResourceBean;
import com.item.entity.TagBean;
import com.item.tool.Result;

public interface TagService {

	// 判断标签是否存在
	public boolean tagExist(String tagname);

	// 查询出标签与它的子标签
	public Result<?> tagSubquery(String tagname);

	// 查询出所有标签信息
	public Result<?> tagAllQuery();

	// 通过ID查询标签的信息
	public Result<?> queryTagById(int id);

	// 根据标签名称模糊查询
	public Result<?> tagQuery(String tagname);

	// 添加获取删除节点
	public Result<?> insertOrUpdateType(TagBean tagBean);

	// 删除节点
	public Result<?> deleteTypeById(TagBean tagBean);

	// 查询所有的构件库列表
	public Result<?> resourceAllQuery(ResourceBean resourceBean);

	// 添加或者修改
	public Result<?> insertOrUpdateResource(ResourceBean resourceBean);

	// 通过ID删除构建列表
	public Result<?> deleteResourceById(ResourceBean resourceBean);

	// 通过ID查询一级菜单
	public Result<?> queryResourceById(ResourceBean resourceBean);

}
