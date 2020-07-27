package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.item.entity.Page;
import com.item.entity.PakInfo;
import com.item.service.UnityService;
import com.item.service.UserService;
import com.item.tool.Result;

@Controller
@RequestMapping("unity")
public class UnityController {

	@Autowired
	private UnityService unityService;

	@Autowired
	private UserService userService;

	/**
	 * 通过名称模糊查询
	 * 
	 * @param pakInfo
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryPakInfoByDisplayname")
	@ResponseBody
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
	@ResponseBody
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
	@ResponseBody
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
	@ResponseBody
	public Result<?> queryZTree() {
		return unityService.queryZTree();
	}

	/**
	 * ue页面跳转获取用户信息
	 * 
	 * @param username
	 * @param sessionid
	 * @return
	 */
	@RequestMapping(value = "/loginAdminByUserId")
	public String loginAdminByUserId(String username, String password) {
		return "uintylogin";
	}

}
