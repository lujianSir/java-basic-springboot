package com.item.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * 商城用户
 * 
 * @author Administrator
 *
 */
@Entity
public class UserMessage extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 账户余额
	private double account;

	private String accountStr;// 余额

	// 购物车数量
	private int shoppCount;

	// 邮箱
	private String email;

	private String starttime;// 开始时间

	private String endtime;// 结束时间

	private int comform;// 1是商城 2是模型那边

	private int openstatus;// 1可以用 2不可以用

	public int getOpenstatus() {
		return openstatus;
	}

	public void setOpenstatus(int openstatus) {
		this.openstatus = openstatus;
	}

	public int getComform() {
		return comform;
	}

	public void setComform(int comform) {
		this.comform = comform;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getAccountStr() {
		return accountStr;
	}

	public void setAccountStr(String accountStr) {
		this.accountStr = accountStr;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public int getShoppCount() {
		return shoppCount;
	}

	public void setShoppCount(int shoppCount) {
		this.shoppCount = shoppCount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
