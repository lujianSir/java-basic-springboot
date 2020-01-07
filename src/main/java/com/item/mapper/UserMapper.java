package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.tool.Result;

/**
  *   针对用户数据库操作
 * @author hjy
 */
@Repository
public interface UserMapper {
	
	//判断用户是否存在(管理页面)
	public int userExist(String username);
	
	//根据用户名密码登录(管理页面)
	public UserBean userLogin(String username);
	
	//用户注册(管理页面)
	public void userRegister(UserBean user);
	
	//根据用户名称查询用户信息(管理页面)
	public UserBean queryByName(String username);
	
	//根据用户角色身份查询用户信息(管理页面)
	public List<UserBean> queryByRole(int role);
	
	
		
	
	
	//判断用户是否存在(商城页面)
	public int userMessageExist(String username);
	
	//根据用户名密码登录(商城页面)
	public UserMessage userMessageLogin(String username);
	
	//用户注册(商城页面)
	public void userMessageRegister(UserMessage userMessage);
		
	

}
