package com.item.entity;

import java.io.Serializable;

/**
 * 购物车实体
 * 
 * @author Administrator
 *
 */
public class ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 购物车id
	private String sid;

	// 商城用户ID
	private String uid;

	// 模型ID
	private int mid;

	// 模型名称
	private String modelname;

	// 模型图片
	private String filePics;

	// 模型上传的人名称
	private String username;

	// 模型价格(计算可得)
	private String account;

	// 周期
	private int cycle; // 一个月 1 半年 2 一年 3 永久 4

	// 显示周期
	private String cyclename;

	// 状态
	private int status; // 是否支付 0是未支付 1是支付

	// 开始时间
	private String starttime;

	// 结束时间
	private String endtime;

	// 预留字段一
	private String str1;

	// 预留字段一
	private String str2;

	// 预留字段一
	private String str3;

	private int str4;

	private String unitprice; // 单价

	private String modelprice;// 模型总价

	public int getStr4() {
		return str4;
	}

	public void setStr4(int str4) {
		this.str4 = str4;
	}

	public String getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}

	public String getModelprice() {
		return modelprice;
	}

	public void setModelprice(String modelprice) {
		this.modelprice = modelprice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public String getFilePics() {
		return filePics;
	}

	public void setFilePics(String filePics) {
		this.filePics = filePics;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
