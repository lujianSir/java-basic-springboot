package com.item.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.alipay.FlowModel;
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
	 * 管理后台查询
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/queryUserBeanByStr")
	public Result<?> queryUserBeanByStr(String str,Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<UserBean> list=userService.queryUserBeanByStr(str);	
		PageInfo<UserBean> pageInfo = new PageInfo<UserBean>(list);				
		return Result.success(pageInfo);
	}
	
	
	/**
	 * 通过用户ID删除管理用户
	 * @param userid
	 * @return
	 */
	@RequestMapping(value = "/deletUserBeanByUserId")
	public Result<?> deletUserBeanByUserId(String userid) {
		if(userid.equals("00da3c04c1b14519862301666987bfcd")) {
			return Result.error(201, "超级管理员不能修改");
		}else {
			int num=userService.deletUserBeanByUserId(userid);	
			if(num>0) {
				return Result.success();
			}else {
				return Result.error(201, "删除失败");
			}
		}
		
		
	}
		
	/**
	 * 通过ID编辑管理用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateUserBeanByUserId")
	public Result<?> updateUserBeanByUserId(UserBean user) {
		if(user.getUserid().equals("00da3c04c1b14519862301666987bfcd")) {
			return Result.error(201, "超级管理员不能修改");
		}else {			
			return userService.updateUserBeanByUserId(user);			
		}
				
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
	
	
	/**
	 * 获取验证码
	 * @param email
	 * @return
	 */
	@RequestMapping("getCheckCode")
    public Result<?> getCheckCode(String email){
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为："+checkCode;
        try {
        	userService.sendSimpleMail(email, "注册验证码", message);
        }catch (Exception e){
            return Result.error(500, "失败");
        }
        return Result.success(checkCode);
    }

}
