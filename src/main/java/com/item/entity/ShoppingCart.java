package com.item.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 购物车实体
 * @author Administrator
 *
 */
public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//购物车id
	private String sid; 

	//商城用户ID
	private String uid;
	
	//模型ID
	private int mid;
	
	//模型上传的人名称
	private String username;
	
	//模型价格(计算可得)
	private double account;
	
	//周期
	private int cycle; //一个月 1  半年 2  一年 3  永久 4
	
	//显示周期
	private String cyclename;
	
	//预留字段一
	private String str1;
	
	//预留字段一
	private String str2;
		
	//预留字段一
	private String str3;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public String getCyclename() {
		return cyclename;
	}

	public void setCyclename(String cyclename) {
		this.cyclename = cyclename;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}
	
	
}
