package com.item.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.LoginMessage;
import com.item.entity.Page;
import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.service.UserService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 管理用户登录接口
	 * 
	 * @param username用户名1
	 * @param password密码
	 * @return
	 */
	@RequestMapping(value = "/login")
	public Result<?> userLogin(String username, String password, HttpServletRequest request) {
		return userService.userLogin(username, password, request);
	}

	/**
	 * 管理用户注册接口
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
	 * 管理后台查询
	 * 
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/queryUserBeanByStr")
	public Result<?> queryUserBeanByStr(String str, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<UserBean> list = userService.queryUserBeanByStr(str);
		PageInfo<UserBean> pageInfo = new PageInfo<UserBean>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 查询所有人的信息
	 * 
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/queryUserBean")
	public Result<?> queryUserBean(String str) {
		List<UserBean> list = userService.queryUserBeanByStr(str);
		return Result.success(list);
	}

	/**
	 * 通过用户ID删除管理用户
	 * 
	 * @param userid
	 * @return
	 */
	@RequestMapping(value = "/deletUserBeanByUserId")
	public Result<?> deletUserBeanByUserId(String userid) {
		if (userid.equals("00da3c04c1b14519862301666987bfcd")) {
			return Result.error(201, "超级管理员不能修改");
		} else {
			int num = userService.deletUserBeanByUserId(userid);
			if (num > 0) {
				return Result.success();
			} else {
				return Result.error(201, "删除失败");
			}
		}

	}

	/**
	 * 通过ID编辑管理用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateUserBeanByUserId")
	public Result<?> updateUserBeanByUserId(UserBean user) {
		if (user.getUserid().equals("00da3c04c1b14519862301666987bfcd")) {
			return Result.error(201, "超级管理员不能修改");
		} else {
			return userService.updateUserBeanByUserId(user);
		}

	}

	/**
	 * 商城用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/userMessageLogin")
	public Result<?> userMessageLogin(HttpServletRequest request, String username, String password, String comform) {
		int num = 0;
		if (comform != null && !comform.equals("")) {
			num = Integer.parseInt(comform);
		}
		return userService.userMessageLogin(request, username, password, num);
	}

	/**
	 * 用户退出1
	 * 
	 * @return
	 */
	@RequestMapping(value = "/userMessageOut")
	public Result<?> userMessageOut(String username, String sessionId) {
		return userService.userMessageOut(username, sessionId);
	}

	/**
	 * 用户退出(内部)
	 * 
	 * @param username
	 * @return
	 */
	@RequestMapping(value = "/userMessageOutByAdmin")
	public Result<?> userMessageOutByAdmin(String username) {
		return userService.userMessageOutByAdmin(username);
	}

	/**
	 * 商城用户注册
	 * 
	 * @param userMessage
	 * @return
	 */
	@RequestMapping(value = "/userMessageRegister")
	public Result<?> userMessageRegister(UserMessage userMessage) {
		return userService.userMessageRegister(userMessage);
	}

	/**
	 * 获取验证码
	 * 
	 * @param email
	 * @return
	 */
	@RequestMapping("getCheckCode")
	public Result<?> getCheckCode(String email) {
		System.out.println("进入服务器");
		String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
		String message = "您的注册验证码为：" + checkCode;
		System.out.println(message);
		try {
			userService.sendSimpleMail(email, "注册验证码", message);
			System.out.println("已发送");
		} catch (Exception e) {
			return Result.error(500, "失败");
		}
		return Result.success(checkCode);
	}

	/**
	 * 后台查询商城所有的用户信息
	 * 
	 * @param str
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/queryUserMessages")
	public Result<?> queryUserMessages(String str, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<UserMessage> list = userService.queryUserMessages(str);
		PageInfo<UserMessage> pageInfo = new PageInfo<UserMessage>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 通过商城用户ID删除用户
	 * 
	 * @param userMessage
	 * @return
	 */
	@RequestMapping(value = "/deleteUserMessageByUserId")
	public Result<?> deleteUserMessageByUserId(UserMessage userMessage) {
		int num = userService.deleteUserMessageByUserId(userMessage);
		return Result.success(num);
	}

	/**
	 * 添加或者修改商城用户信息
	 * 
	 * @param userMessage
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateUserMessage")
	public Result<?> insertOrUpdateUserMessage(UserMessage userMessage, String accountStr) {
		if (accountStr != null && !accountStr.equals("")) {
			userMessage.setAccount(Double.parseDouble(accountStr));
		}
		return userService.insertOrUpdateUserMessage(userMessage);
	}

	/**
	 * 通过ID查询商城用户信息
	 * 
	 * @param userid
	 * @return
	 */
	@RequestMapping(value = "/queryUserMessageByUserId")
	public Result<?> queryUserMessageByUserId(String userid) {
		UserMessage userMessage = userService.queryUserMessageByUserId(userid);
		return Result.success(userMessage);
	}

	/**
	 * 查询后台用户信息
	 * 
	 * @param userid
	 * @return
	 */
	@RequestMapping(value = "/queryUserBeanByUserId")
	public Result<?> queryUserBeanByUserId(String userid, HttpServletRequest request) {
		UserBean userBean = userService.queryUserBeanByUserId(userid, request);
		return Result.success(userBean);
	}

	/**
	 * 修改密码
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updatePassword")
	public Result<?> updatePassword(UserBean user) {
		return userService.updateUserBeanByUserId(user);
	}

	/**
	 * 
	 * @param loginMessage
	 * @return
	 */
	@RequestMapping(value = "/getMessage")
	public Result<?> getMessage(LoginMessage loginMessage) {
		return userService.getMessage(loginMessage);
	}

}
