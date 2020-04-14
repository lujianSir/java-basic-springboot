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
