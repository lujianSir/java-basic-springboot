package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.ResourceBean;
import com.item.entity.TagBean;

@Repository
public interface TagMapper {

	// 判断标签是否存在
	public int tagExist(String tagname);

	// 根据标签名称模糊查询
	public List<TagBean> tagQuery(String tagname);

	// 查询出标签与它的子标签
	public List<TagBean> tagSubquery(String tagname);

	// 查询出所有标签信息(递归 父查询子)
	public List<TagBean> tagAllQuery();

	// 通过ID查询标签的信息
	public TagBean queryTagById(int id);

	// 通过ID查询父类
	public List<TagBean> queryTagFatherById(int id);

	// 添加节点
	public int insertType(TagBean tagBean);

	// 修改节点
	public int updateType(TagBean tagBean);

	// 删除节点
	public int deleteTypeById(int id);

	// 查询所有的构建类型
	public List<ResourceBean> resourceAllQuery(ResourceBean resourceBean);

	// 添加构建类型
	public int insertResource(ResourceBean resourceBean);

	// 编辑构建类型
	public int updateResource(ResourceBean resourceBean);

	// 通过ID删除构建列表
	public int deleteResourceById(ResourceBean resourceBean);

	// 通过ID查询一级菜单
	public List<ResourceBean> queryResourceById(ResourceBean resourceBean);

	// 删除所有的信息
	public void deleteResourceAll();

	// 批量添加所有信息
	public void insertResourceAll(List<ResourceBean> list);

}
