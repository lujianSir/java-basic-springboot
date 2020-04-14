package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.Power;
import com.item.entity.Role;

@Repository
public interface PowerMapper {

	/**
	 * 通过用户ID查询对应的权限
	 * 
	 * @param uid
	 * @return
	 */
	public List<Power> queryPowerByUserId(String uid);

	// 查询该角色对应的权限
	public List<Power> queryPowersByRid(Role role);
}
