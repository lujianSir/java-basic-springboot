package com.item.entity;

import java.sql.Date;

public class User {

		//用户ID，主键
		private String userid;
		// 昵称
		private String nickname;
		// 登录名称
		private String username;				
		// 登录密码
		private String password;
		//用户状态
		private int status; //0是关闭  1是开启  默认开启
		// 注册时间
		private Date registertime;
		
		
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
						
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public Date getRegistertime() {
			return registertime;
		}
		public void setRegistertime(Date registertime) {
			this.registertime = registertime;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		
		
}
