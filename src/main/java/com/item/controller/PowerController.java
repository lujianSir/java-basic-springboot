package com.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.Power;
import com.item.service.PowerService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "power")
public class PowerController {

	@Autowired
	private PowerService powerService;
	
	/**
	 * 通过用户查询权限
	 * @param uid
	 * @return
	 */
	@RequestMapping(value = "/queryPowerByUserId")
	public Result<?> queryPowerByUserId(String uid) {	
		List<Power> list=powerService.queryPowerByUserId(uid);		
		return Result.success(list);
	}
}
