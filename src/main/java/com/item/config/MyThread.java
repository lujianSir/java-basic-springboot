package com.item.config;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.item.entity.LoginMessage;
import com.item.mapper.UserMapper;
import com.item.service.UserService;
import com.item.tool.Utils;

/**
 * @author wangmaoxiong Created by Administrator on 2018/6/28 0028. 自定义任务
 */
public class MyThread implements Runnable {
	// private Random random = null;

	private String username;

	public MyThread() {
		// random = new Random();
	}

	public MyThread(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		try {
			System.out.println("任务执行开始:" + new Date());
			LoginMessage loginMessage = new LoginMessage();
			loginMessage.setUsername(username);
			UserMapper userMapper = (UserMapper) SpringUtil.getBean(UserMapper.class);
			LoginMessage msg = userMapper.queryLoginMessageByUsername(loginMessage);
			if (msg.getTotal() > 0) {
				String oldlogintime = msg.getLogintime();
				String nowtime = Utils.getCurrent();
				String min = Utils.getHour(oldlogintime, nowtime, "yyyy-MM-dd HH:mm");
				if (Integer.parseInt(min) >= 6) {
					UserService userService = (UserService) SpringUtil.getBean(UserService.class);
					userService.userMessageOutByAdmin(username);
					loginMessage.setTotal(0);
					userMapper.updateLoginMessage(loginMessage);
					System.out.println("操作成功");
				}
			} else {
				System.out.println("已经断了");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/** 使用Executors工具快速构建对象 */
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		// System.out.println("3秒后开始执行计划线程池服务..." + new Date());
		String str = "张三";
		scheduledExecutorService.scheduleAtFixedRate(new MyThread(str), 0, 3, TimeUnit.SECONDS);
	}
}
