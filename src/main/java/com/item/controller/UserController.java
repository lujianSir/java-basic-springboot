package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.UserBean;
import com.item.service.UserService;
import com.item.tool.JavaTool;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**用户登录接口
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public Result<?> userLogin(@RequestParam("username") String username,
								@RequestParam("password") String password) {
		
		return userService.userLogin(username, password);
	}
	
	/**用户注册接口
	 * 
	 * @param username
	 * @param password
	 * @param remark
	 * @param status
	 * @return
	 */
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public Result<?> userRegister(@RequestParam("username") String username,
								@RequestParam("password") String password,
								@RequestParam("role") int role,
								@RequestParam("status") String status) {
		
		UserBean user = new UserBean();
		
		user.setUserName(username);
		password = JavaTool.string2MD5(password);
		user.setPassword(password);
		user.setRole(role);
		user.setStatus(status);
		
		return userService.userRegister(user);
	}
}
