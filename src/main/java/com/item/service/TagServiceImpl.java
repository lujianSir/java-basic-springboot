package com.item.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.mapper.TagMapper;
import com.item.tool.Result;

/**
 * 处理标签相关业务
 * 
 * @author hjy
 *
 */
@Service
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
		try {

			if (tagMapper.tagQuery(tagname).size() > 0) {
				return Result.success(tagMapper.tagQuery(tagname));
			} else {
				return Result.error(50010, "标签不存在");
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500,"服务端异常");
		}
	}
	
	/** 查询此标签下所有的子标签
	 * 
	 */
	@Override
	public Result<?> tagSubquery(String tagname) {
		
		try {
			if(this.tagExist(tagname)) {
				
				return Result.success(tagMapper.tagSubquery(tagname));
			}else {
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
		return null;
	}

}
