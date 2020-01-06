package com.item.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * 后台管理用户
 * @author Administrator
 *
 */
@Entity
public class UserMessage extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;		
	
	//账户余额
	private double account;
	
	private String remark;

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
