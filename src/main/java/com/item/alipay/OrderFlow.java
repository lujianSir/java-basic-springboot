package com.item.alipay;

import java.io.Serializable;

public class OrderFlow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 订单ID
	private String oid;

	// 订单状态
	private int orderstatus; // 0 待付款 1 已支付

	// 订单金额
	private String orderamount;

	// 购买用户
	private String uid;

	// 模型ID
	private String mids;

	// 周期
	private int cycle;

	private String cyclename;

	// 模型名称
	private String mname;

	// 订单创建时间
	private String createtime;

	// 支付时间
	private String paidtime;

	// 支付方式
	private int paidmethod;// 支付方式 1 支付宝 2 微信 3商城币

	// 预留字段
	private String str1;

	// 预留字段
	private String str2;

	private String strname;// 支付方式

	private String username;// 用户

	public String getCyclename() {
		return cyclename;
	}

	public void setCyclename(String cyclename) {
		this.cyclename = cyclename;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStrname() {
		return strname;
	}

	public void setStrname(String strname) {
		this.strname = strname;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public String getOrderamount() {
		return orderamount;
	}

	public void setOrderamount(String orderamount) {
		this.orderamount = orderamount;
	}

	public String getMids() {
		return mids;
	}

	public void setMids(String mids) {
		this.mids = mids;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getPaidtime() {
		return paidtime;
	}

	public void setPaidtime(String paidtime) {
		this.paidtime = paidtime;
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

	public int getPaidmethod() {
		return paidmethod;
	}

	public void setPaidmethod(int paidmethod) {
		this.paidmethod = paidmethod;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

}
