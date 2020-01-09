package com.item.alipay;

import java.io.Serializable;
import java.util.Date;

public class OrderFlow implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单ID
	private String oid;
	
	//订单状态
	private int orderstatus;  // 0 待付款  1 已支付
	
	//订单金额
	private double orderamount;
	
	//模型ID
	private String mids;

	//订单创建时间
	private Date createtime;
	
	//支付时间
	private Date paidtime;
	
	//支付方式
	private String paidmethod;//支付方式          
	
	//预留字段
	private String str1;
	
	//预留字段
	private String str2;

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

	public double getOrderamount() {
		return orderamount;
	}

	public void setOrderamount(double orderamount) {
		this.orderamount = orderamount;
	}

	public String getMids() {
		return mids;
	}

	public void setMids(String mids) {
		this.mids = mids;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getPaidtime() {
		return paidtime;
	}

	public void setPaidtime(Date paidtime) {
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

	public String getPaidmethod() {
		return paidmethod;
	}

	public void setPaidmethod(String paidmethod) {
		this.paidmethod = paidmethod;
	}
	
	
}
