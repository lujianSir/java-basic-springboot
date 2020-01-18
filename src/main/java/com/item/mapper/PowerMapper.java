package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.Power;

@Repository
public interface PowerMapper {

	/**
	 * 通过用户ID查询对应的权限
	 * @param uid
	 * @return
	 */
	public List<Power> queryPowerByUserId(String uid);
}
