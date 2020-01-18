package com.item.service;

import java.util.List;

import com.item.entity.Power;

public interface PowerService {
	
	/**
	 * 通过用户ID查询对应的权限
	 * @param uid
	 * @return
	 */
	public List<Power> queryPowerByUserId(String uid);
}
