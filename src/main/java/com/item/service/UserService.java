package com.item.service;

import com.item.entity.UserBean;
import com.item.tool.Result;


public interface UserService {
	
	
	//判断用户是否存在
	public boolean userExist(String username);
	
	//根据用户名密码登录
	public Result<?> userLogin(String username,String password);
	
	//用户注册
	public Result<?> userRegister(UserBean user);
	
	
}
