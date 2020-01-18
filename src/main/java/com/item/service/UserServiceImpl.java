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
				if(user.getStatus()==1) {
					if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {
						 
						// 清除密码消息
						user.setPassword("");								
						return Result.success(user);
					} else {
						return Result.error(50010, "用户密码错误");
					}
					
				}else {
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
				if(user.getNickname()==null || user.getNickname().endsWith("")) {
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
				userMessage.setRegistertime(JavaTool.getUserCurrent());
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
				if(user.getStatus()==1) {
					// 判断密码是否相等
					if (user.getPassword().trim().equals(JavaTool.string2MD5(password).trim())) {
						
						String token = TokenUtil.sign(user);
						// 将token放在密码带出去
						user.setPassword(token);
						int shoppCount=shoppingMapper.selectShoppingCartCountByUid(user.getUserid());
						user.setShoppCount(shoppCount);
						return Result.success(user);
					} else {
						return Result.error(50010, "用户密码错误");
					}
				}else {
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
		return userMapper.deletUserBeanByUserId(userid);
	}

	@Override
	public Result<?>  updateUserBeanByUserId(UserBean user) {
		// TODO Auto-generated method stub
		//user.setRegistertime(JavaTool.getUserCurrent());		
		if(user.getUsername()==null || user.getUsername().equals("")) {	//修改密码	
			if(user.getPassword()!=null&& !user.getPassword().equals("")) {
				user.setPassword(JavaTool.string2MD5(user.getPassword()).trim());
			}
			Result.success(userMapper.updateUserBeanByUserId(user));			
		}else {
			//UserBean oneUserBean =userMapper.queryByUserId(user.getUserid());//一定有
			UserBean otherUserBean=userMapper.queryByName(user.getUsername());//不一定有
			if(otherUserBean!=null) {
				if(user.getUsername().equals(otherUserBean.getUsername())&& !user.getUserid().equals(otherUserBean.getUserid())) {
					return Result.error(201, "用户名已经存在");
				}else {
					if(user.getPassword()!=null&& !user.getPassword().equals("")) {
						user.setPassword(JavaTool.string2MD5(user.getPassword()).trim());
					}
					return Result.success(userMapper.updateUserBeanByUserId(user));
				}	
			}else {
				if(user.getPassword()!=null&& !user.getPassword().equals("")) {
					user.setPassword(JavaTool.string2MD5(user.getPassword()).trim());					
				}
				return Result.success(userMapper.updateUserBeanByUserId(user));
			}
					
		}
		return Result.success();				
	}

}
