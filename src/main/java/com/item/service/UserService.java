package com.item.service;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.tool.Result;


public interface UserService {
	
	
	//判断用户是否存在
	public boolean userExist(String username);
	
	//根据用户名密码登录(管理页面)
	public Result<?> userLogin(String username,String password);
	
	//用户注册(管理页面)
	public Result<?> userRegister(UserBean user);
	
	
	
	
	//用户注册(商城页面)
	public Result<?> userMessageRegister(UserMessage userMessage);
	
	//根据用户名密码登录(商城页面)
	public Result<?> userMessageLogin(String username,String password);
	
	//发送邮件
	public void sendSimpleMail(String to,String title,String content);
	
}
