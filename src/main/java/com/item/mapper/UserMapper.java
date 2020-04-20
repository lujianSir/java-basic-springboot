package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;

/**
 * 针对用户数据库操作
 * 
 * @author hjy
 */
@Repository
public interface UserMapper {

	// 判断用户是否存在(管理页面)
	public int userExist(String username);

	// 根据用户名密码登录(管理页面)
	public UserBean userLogin(String username);

	// 用户注册(管理页面)
	public void userRegister(UserBean user);

	// 根据用户名称查询用户信息(管理页面)
	public UserBean queryByName(String username);

	// 通过ID查询用户(管理页面)
	public UserBean queryByUserId(String userid);

	// 根据用户角色身份查询用户信息(管理页面)
	public List<UserBean> queryByRole(int role);

	// 通过用户名或者手机号查询(管理页面)
	public List<UserBean> queryUserBeanByStr(String str);

	// 通过ID删除用户
	public int deletUserBeanByUserId(String userid);

	// 通过用户ID编辑(管理页面)
	public int updateUserBeanByUserId(UserBean user);

	// 判断用户是否存在(商城页面)
	public int userMessageExist(String username);

	// 根据用户名密码登录(商城页面)
	public UserMessage userMessageLogin(String username);

	// 用户注册(商城页面)
	public void userMessageRegister(UserMessage userMessage);

	// 查询所有的商城用户
	List<UserMessage> queryUserMessages(String str);

	// 通过商城用户ID删除用户
	int deleteUserMessageByUserId(UserMessage userMessage);

	// 添加商城用户信息
	int insertUserMessage(UserMessage userMessage);

	// 修改用户信息
	int updateUserMessage(UserMessage userMessage);

	// 通过用户的ID查询商城币
	UserMessage queryUserMessageByUserId(String userid);

}
