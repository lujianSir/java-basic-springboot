package com.item.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.ResourceInfo;
import com.item.entity.TagBean;
import com.item.mapper.TagMapper;
import com.item.tool.Result;

/**
 * 处理标签相关业务
 * 
 * @author hjy
 *
 */
@Service
@Transactional
public class TagServiceImpl implements TagService {

	private static final Logger LOG = LoggerFactory.getLogger(TagServiceImpl.class);

	@Autowired
	private TagMapper tagMapper;

	/**
	 * 判断标签是否存在
	 * 
	 */
	@Override
	public boolean tagExist(String tagname) {

		int i = tagMapper.tagExist(tagname);

		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 根据标签模糊查询
	 * 
	 */
	@Override
	public Result<?> tagQuery(String tagname) {
		List<Object> lists = new ArrayList<Object>();
		try {
			List<TagBean> list = tagMapper.tagQuery(tagname);
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					int id = 0;
					id = list.get(i).getId();
					List<TagBean> t = tagMapper.queryTagFatherById(id);
					lists.add(t);
				}
				return Result.success(lists);
			} else {
				return Result.error(200, "");
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(200, "");
		}
	}

	/**
	 * 查询此标签下所有的子标签
	 * 
	 */
	@Override
	public Result<?> tagSubquery(String tagname) {

		try {
			if (this.tagExist(tagname)) {

				return Result.success(tagMapper.tagSubquery(tagname));
			} else {
				return Result.error(50010, "标签不存在");
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端异常");
		}
	}

	@Override
	public Result<?> tagAllQuery() {
		// TODO Auto-generated method stub
		List<TagBean> list = tagMapper.tagAllQuery();
		return Result.success(list);
	}

	@Override
	public Result<?> queryTagById(int id) {
		// TODO Auto-generated method stub
		TagBean tagBean = tagMapper.queryTagById(id);
		return Result.success(tagBean);
	}

	@Override
	public Result<?> insertOrUpdateType(TagBean tagBean) {
		// TODO Auto-generated method stub
		int id = tagBean.getId();
		int num = 0;
		if (id > 0) {
			num = tagMapper.updateType(tagBean);
		} else {
			num = tagMapper.insertType(tagBean);
			num = tagBean.getId();
		}
		if (num > 0) {
			return Result.success(num);
		} else {
			return Result.error(500, "请求失败");
		}

	}

	@Override
	public Result<?> deleteTypeById(TagBean tagBean) {
		// TODO Auto-generated method stub
		int total = tagMapper.queryTagBeansByPid(tagBean.getId());
		if (total > 0) {
			return Result.error(500, "该数据下有子集，请先删除子集");
		} else {
			return Result.success(tagMapper.deleteTypeById(tagBean.getId()));
		}

	}

	@Override
	public Result<?> resourceAllQuery(ResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		return Result.success(tagMapper.resourceAllQuery(resourceInfo));
	}

	@Override
	public Result<?> insertOrUpdateResource(ResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		int id = resourceInfo.getId();
		int num = 0;
		if (id > 0) {
			num = tagMapper.updateResource(resourceInfo);
		} else {
			num = tagMapper.insertResource(resourceInfo);
			num = resourceInfo.getId();
		}
		if (num > 0) {
			return Result.success(num);
		} else {
			return Result.error(500, "请求失败");
		}
	}

	@Override
	public Result<?> deleteResourceById(ResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		List<ResourceInfo> list = tagMapper.queryResourcesByPid(resourceInfo);
		if (list.size() > 0) {
			return Result.error(500, "该数据有子集，请先删除子集");
		} else {
			return Result.success(tagMapper.deleteResourceById(resourceInfo));
		}

	}

	@Override
	public Result<?> queryResourceById(ResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		return Result.success(tagMapper.queryResourceById(resourceInfo));
	}

	@Override
	public Result<?> updateresourceinfo(List<ResourceInfo> list) {
		// TODO Auto-generated method stub
		tagMapper.deleteResourceAll();
		tagMapper.insertResourceAll(list);
		return Result.success();
	}

}
