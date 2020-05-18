package com.item.service;

import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.tool.Result;

public interface UnityService {

	/**
	 * 通过类别或者名称查询
	 * 
	 * @param pakInfo
	 * @return
	 */
	Page queryPakInfoByName(String name, Page page);

	/**
	 * 通过名称模糊查询
	 * 
	 * @param pakInfo
	 * @return
	 */
	Page queryPakInfoByDisplayname(PakInfo pakInfo, Page page);

	/**
	 * 查询所有的标签
	 * 
	 * @param resourceBean
	 * @return
	 */
	Result<?> queryZTree();
}