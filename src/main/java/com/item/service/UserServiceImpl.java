package com.item.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.item.entity.UserBean;
import com.item.entity.UserMessage;
import com.item.mapper.ShoppingMapper;
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

	@Value("${spring.mail.username}")
	private String from;
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private ShoppingMapper shoppingMapper;

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
				if (user.getStatus() == 1) {
					if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {
						String ip = JavaTool.getIp();
						UserBean u = new UserBean();
						u.setUserid(user.getUserid());
						u.setOldip(ip);
						u.setStatus(user.getStatus());
						userMapper.updateUserBeanByUserId(u);
						// 清除密码消息
						user.setPassword("");
						user.setNewip(ip);
						return Result.success(user);
					} else {
						return Result.error(50010, "用户密码错误");
					}

				} else {
					return Result.error(50030, "用户已被禁用");
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
				if (user.getNickname() == null || user.getNickname().equals("")) {
					user.setNickname(user.getUsername());
				}
				user.setRegistertime(JavaTool.getUserCurrent());
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
		int num = userMapper.userMessageExist(userMessage.getUsername());
		try {
			if (num > 0) {
				return Result.error(50010, "用户已存在");
			} else {
				userMessage.setPassword(JavaTool.string2MD5(userMessage.getPassword()));
				userMessage.setUserid(JavaTool.getUserId());
				if (userMessage.getNickname() == null || userMessage.getNickname().equals("")) {
					userMessage.setNickname(userMessage.getUsername());
				}
				userMessage.setStatus(1);
				userMessage.setRegistertime(JavaTool.getUserCurrent());
				userMapper.userMessageRegister(userMessage);// 注册商城用户

				UserBean userBean = new UserBean();
				userBean.setUserid(userMessage.getUserid());
				userBean.setNickname(userMessage.getNickname());
				userBean.setUsername(userMessage.getUsername());
				userBean.setPassword(userMessage.getPassword());
				userBean.setRegistertime(userMessage.getRegistertime());
				userBean.setRole(3);
				userBean.setStatus(1);
				userMapper.userRegister(userBean);// 同时注册后台用户 默认为一般用户

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
		int num = userMapper.userMessageExist(username);
		try {
			if (num > 0) {
				// 获取user信息
				UserMessage user = userMapper.userMessageLogin(username);
				if (user.getStatus() == 1) {
					// 判断密码是否相等
					if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {

						String token = TokenUtil.sign(user);
						// 将token放在密码带出去
						user.setPassword(token);
						int shoppCount = shoppingMapper.selectShoppingCartCountByUid(user.getUserid());
						user.setShoppCount(shoppCount);
						return Result.success(user);
					} else {
						return Result.error(50010, "用户密码错误");
					}
				} else {
					return Result.error(50030, "用户已被禁用");
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

	@Override
	public void sendSimpleMail(String to, String title, String content) {
		// TODO Auto-generated method stub
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(title);
		message.setText(content);
		mailSender.send(message);
		LOG.info("邮件发送成功");
	}

	@Override
	public List<UserBean> queryUserBeanByStr(String str) {
		// TODO Auto-generated method stub
		return userMapper.queryUserBeanByStr(str);
	}

	@Override
	public int deletUserBeanByUserId(String userid) {
		// TODO Auto-generated method stub
		UserMessage userMessage = new UserMessage();
		userMessage.setUserid(userid);
		userMapper.deleteUserMessageByUserId(userMessage);
		return userMapper.deletUserBeanByUserId(userid);
	}

	@Override
	public Result<?> updateUserBeanByUserId(UserBean user) {
		// TODO Auto-generated method stub
		// user.setRegistertime(JavaTool.getUserCurrent());
		int row = userMapper.userExist(user.getUserid());// 不一定有
		if (row > 0) {
			return Result.error(201, "用户名已经存在");
		} else {
			UserMessage userMessage = new UserMessage();
			if (user.getPassword() != null && !user.getPassword().equals("")) {
				user.setPassword(JavaTool.string2MD5(user.getPassword()).trim());
				userMessage.setPassword(JavaTool.string2MD5(user.getPassword()).trim());
			}
			if (user.getNickname() == null || user.getNickname().equals("")) {
				user.setNickname(user.getUsername());
				userMessage.setNickname(user.getUsername());
			}

			userMessage.setUserid(user.getUserid());
			userMessage.setStatus(user.getStatus());
			userMessage.setUsername(user.getUsername());
			userMapper.updateUserMessage(userMessage);// 修改商城管理人员
			return Result.success(userMapper.updateUserBeanByUserId(user));// 修改后台管理人员
		}

	}

	@Override
	public List<UserMessage> queryUserMessages(String str) {
		// TODO Auto-generated method stub
		return userMapper.queryUserMessages(str);
	}

	@Override
	public int deleteUserMessageByUserId(UserMessage userMessage) {
		// TODO Auto-generated method stub
		userMapper.deletUserBeanByUserId(userMessage.getUserid());
		return userMapper.deleteUserMessageByUserId(userMessage);
	}

	@Override
	public Result<?> insertOrUpdateUserMessage(UserMessage userMessage) {
		// TODO Auto-generated method stub
		if (userMessage.getUserid() != null && !userMessage.getUserid().equals("")) {// 编辑
			UserBean user = new UserBean();
			if (userMessage.getPassword() != null && !userMessage.getPassword().equals("")) {
				userMessage.setPassword(JavaTool.string2MD5(userMessage.getPassword()));
				user.setPassword(JavaTool.string2MD5(userMessage.getPassword()));
			}
			if (userMessage.getNickname() == null || userMessage.getNickname().equals("")) {
				userMessage.setNickname(userMessage.getUsername());
				user.setNickname(userMessage.getUsername());
			}
			user.setUsername(userMessage.getUsername());
			user.setUserid(userMessage.getUserid());
			user.setStatus(userMessage.getStatus());
			userMapper.updateUserBeanByUserId(user);// 修改后台管理人

			userMapper.updateUserMessage(userMessage);// 修改商城管理人员
			return Result.success();
		} else {// 添加
			int num = userMapper.userMessageExist(userMessage.getUsername());
			if (num > 0) {
				return Result.error(500, "用户已存在");
			} else {
				if (userMessage.getPassword() != null && !userMessage.getPassword().equals("")) {
					userMessage.setPassword(JavaTool.string2MD5(userMessage.getPassword()));
				}
				userMessage.setUserid(JavaTool.getUserId());
				if (userMessage.getNickname() == null || userMessage.getNickname().equals("")) {
					userMessage.setNickname(userMessage.getUsername());
				}
				userMessage.setRegistertime(JavaTool.getUserCurrent());
				userMapper.insertUserMessage(userMessage);
				return Result.success();
			}
		}
	}

	@Override
	public UserMessage queryUserMessageByUserId(String userid) {
		// TODO Auto-generated method stub
		return userMapper.queryUserMessageByUserId(userid);
	}

}
