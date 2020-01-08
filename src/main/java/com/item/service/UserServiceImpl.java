package com.item.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.mapper.UserMapper;
import com.item.tool.JavaTool;
import com.item.tool.Result;
import com.item.tool.TokenUtil;

/**
 * 用户相关方法，用来处理相关功能业务
 * 
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserMapper userMapper;

	/**
	 * 判断用户是否存在 
	 * 
	 */
	@Override
	public boolean userExist(String username) {

		// 获取user信息
		int i = userMapper.userExist(username);

		if (i == 1) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 用户登录相关逻辑
	 * 
	 */

	@Override
	public Result<?> userLogin(String username, String password) {

		try {
			if (this.userExist(username)) {
				// 获取user信息
				UserBean user = userMapper.userLogin(username);
				// 判断密码是否相等

				if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {
 
					// 清除密码消息
					user.setPassword("");
					return Result.success(user);
				} else {
					return Result.error(50010, "用户密码错误");
				}
			} else {
				return Result.error(50020, "用户不存在");
			}
			// 根据用户信息判断
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端异常");
		}
	}

	/**
	 * 用户注册相关逻辑
	 * 
	 */
	@Override
	public Result<?> userRegister(UserBean user) {
		try {
			if (this.userExist(user.getUsername())) {
				return Result.error(50010, "用户已存在");
			} else {
				user.setPassword(JavaTool.string2MD5(user.getPassword()));
				user.setUserid(JavaTool.getUserId());
				if(user.getNickname()==null || user.getNickname().endsWith("")) {
					user.setNickname(user.getUsername());
				}
				user.setStatus(1);
				userMapper.userRegister(user);
				return Result.success();
			}
		} catch (Exception e) {
			// TODO: handle exception
			LOG.error(e.getMessage());
			return Result.error(50020, "用户注册失败");
		}

	}

	@Override
	public Result<?> userMessageRegister(UserMessage userMessage) {
		// TODO Auto-generated method stub
		int num=userMapper.userMessageExist(userMessage.getUsername());
		try {
			if (num>0) {
				return Result.error(50010, "用户已存在");
			} else {
				userMessage.setPassword(JavaTool.string2MD5(userMessage.getPassword()));
				userMessage.setUserid(JavaTool.getUserId());
				if(userMessage.getNickname()==null || userMessage.getNickname().endsWith("")) {
					userMessage.setNickname(userMessage.getUsername());
				}
				userMessage.setStatus(1);
				userMapper.userMessageRegister(userMessage);
				return Result.success();
			}
		} catch (Exception e) {
			// TODO: handle exception
			LOG.error(e.getMessage());
			return Result.error(50020, "用户注册失败");
		}
	}

	@Override
	public Result<?> userMessageLogin(String username, String password) {
		// TODO Auto-generated method stub
		int num=userMapper.userMessageExist(username);
		try {
			if (num>0) {
				// 获取user信息
				UserMessage user = userMapper.userMessageLogin(username);
				// 判断密码是否相等
				if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {
					
					String token = TokenUtil.sign(user);
					// 将token放在密码带出去
					user.setPassword(token);
					return Result.success(user);
				} else {
					return Result.error(50010, "用户密码错误");
				}
			} else {
				return Result.error(50020, "用户不存在");
			}
			// 根据用户信息判断
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return Result.error(500, "服务端异常");
		}
	}

}
