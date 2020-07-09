package com.item.service;

import java.util.List;

import com.item.entity.ResourceInfo;
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
	public Result<?> resourceAllQuery(ResourceInfo resourceInfo);

	// 添加或者修改
	public Result<?> insertOrUpdateResource(ResourceInfo resourceInfo);

	// 通过ID删除构建列表
	public Result<?> deleteResourceById(ResourceInfo resourceInfo);

	// 通过ID查询一级菜单
	public Result<?> queryResourceById(ResourceInfo resourceInfo);

	// 修改资源库管理
	public Result<?> updateresourceinfo(List<ResourceInfo> list);

}
