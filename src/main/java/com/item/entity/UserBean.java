package com.item.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class UserBean implements Serializable {

	private static final long serialVersionUID = -6813725469825556830L;

	
	//用户ID，主键
	private int userID;
	// 用户名称
	private String userName;
	// 用户密码
	private String password;
	//用户状态
	private String status;
	//账户余额
	private double account;
	// 电话号码
	private String phone;
	// 注册时间
	private Date registertime;
	// 用户身份
	private int role;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
