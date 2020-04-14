package com.item.service;

import java.util.List;

import com.item.entity.Power;
import com.item.entity.Role;
import com.item.tool.Result;

public interface PowerService {

	/**
	 * 通过用户ID查询对应的权限
	 * 
	 * @param uid
	 * @return
	 */
	public List<Power> queryPowerByUserId(String uid);

	// 查询该角色对应的权限
	public Result<?> queryPowersByRid(Role role);
}
