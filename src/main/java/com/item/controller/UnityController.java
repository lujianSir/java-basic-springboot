package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.service.UnityService;
import com.item.tool.Result;

@RestController
@RequestMapping("unity")
public class UnityController {

	@Autowired
	private UnityService unityService;

	/**
	 * 通过名称模糊查询
	 * 
	 * @param pakInfo
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryPakInfoByDisplayname")
	public Result<?> queryPakInfoByDisplayname(PakInfo pakInfo, Page page) {
		page = unityService.queryPakInfoByDisplayname(pakInfo, page);
		return Result.success(page);
	}

	/**
	 * 通过类别或者名称查询
	 * 
	 * @param name
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryPakInfoByName")
	public Result<?> queryPakInfoByName(String name, Page page) {
		page = unityService.queryPakInfoByName(name, page);
		return Result.success(page);
	}

	/**
	 * 查询已经购买的
	 * 
	 * @param name
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryFlowModelByName")
	public Result<?> queryFlowModelByName(String name, Page page, String uid) {
		page = unityService.queryFlowModelByName(name, page, uid);
		return Result.success(page);
	}

	/**
	 * 查询树结构
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryZTree")
	public Result<?> queryZTree() {
		return unityService.queryZTree();
	}
}
