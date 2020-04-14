package com.item.service;

import java.util.List;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.tool.Result;

public interface UserService {

	// 判断用户是否存在
	public boolean userExist(String username);

	// 根据用户名密码登录(管理页面)
	public Result<?> userLogin(String username, String password);

	// 用户注册(管理页面)
	public Result<?> userRegister(UserBean user);

	// 通过用户名或者手机号查询(管理页面)
	public List<UserBean> queryUserBeanByStr(String str);

	// 通过ID删除用户(管理页面)
	public int deletUserBeanByUserId(String userid);

	// 通过用户ID编辑(管理页面)
	public Result<?> updateUserBeanByUserId(UserBean user);

	// 用户注册(商城页面)
	public Result<?> userMessageRegister(UserMessage userMessage);

	// 根据用户名密码登录(商城页面)
	public Result<?> userMessageLogin(String username, String password);

	// 发送邮件
	public void sendSimpleMail(String to, String title, String content);

	// 查询所有的商城用户
	List<UserMessage> queryUserMessages(String str);

	// 通过ID删除商城用户
	int deleteUserMessageByUserId(UserMessage userMessage);

	// 添加或者修改商城用户信息
	Result<?> insertOrUpdateUserMessage(UserMessage userMessage);

}
