package com.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.Power;
import com.item.mapper.PowerMapper;

@Service
public class PowerServiceImpl implements PowerService{

	@Autowired
	private PowerMapper powerMapper;
	
	@Override
	public List<Power> queryPowerByUserId(String uid) {
		// TODO Auto-generated method stub
		return powerMapper.queryPowerByUserId(uid);
	}

}
