package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.service.UserService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**管理用户登录接口
	 * 
	 * @param username用户名
	 * @param password密码
	 * @return
	 */
	@RequestMapping(value = "/login")
	public Result<?> userLogin(String username,String password) {		
		return userService.userLogin(username, password);
	}
	
	/**管理用户注册接口
	 * 
	 * @param username
	 * @param password
	 * @param remark
	 * @param status
	 * @return
	 */
	@RequestMapping(value = "/register")
	public Result<?> userRegister(UserBean userBean) {
		return userService.userRegister(userBean);
	}
	
	
	/**
	 * 商城用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/userMessageLogin")
	public Result<?> userMessageLogin(String username,String password) {		
		return userService.userMessageLogin(username, password);
	}
	
	/**
	 * 商城用户注册
	 * @param userMessage
	 * @return
	 */
	@RequestMapping(value = "/userMessageRegister")
	public Result<?> userMessageRegister(UserMessage userMessage) {
		return userService.userMessageRegister(userMessage);
	}
	
}
