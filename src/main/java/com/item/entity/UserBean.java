package com.item.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * 后台管理用户
 * 
 * @author Administrator
 *
 */
@Entity
public class UserBean extends User implements Serializable {

	private static final long serialVersionUID = -6813725469825556830L;

	// 电话
	private String phone;

	// 角色
	private int role;

	private String rname;

	private String oldip;// 上次IP地址

	private String newip;// 本次IP

	private String logintime;// 登录时间

	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	public String getOldip() {
		return oldip;
	}

	public void setOldip(String oldip) {
		this.oldip = oldip;
	}

	public String getNewip() {
		return newip;
	}

	public void setNewip(String newip) {
		this.newip = newip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
