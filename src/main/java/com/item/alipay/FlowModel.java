package com.item.alipay;

import java.io.Serializable;

/**
 * 已购模型
 * 
 * @author Administrator
 *
 */
public class FlowModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// id
	private String fid;

	// 商城用户ID
	private String uid;

	private String modelname;

	private String filePics;

	// 模型ID
	private int mid;

	// 最终交易的钱
	private String endaccount;

	// 周期
	private int cycle; // 一个月 1 半年 2 一年 3 永久 4

	// 周期名称
	private String cyclename;//

	// 开始时间
	private String starttime;

	// 结束时间
	private String endtime;

	private int saynew;// 是否是新的

	private String creattime;// 创建的时间

	private int status;// 0 到期 1未到期

	public String getCreattime() {
		return creattime;
	}

	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

	public int getSaynew() {
		return saynew;
	}

	public void setSaynew(int saynew) {
		this.saynew = saynew;
	}

	public String getCyclename() {
		return cyclename;
	}

	public void setCyclename(String cyclename) {
		this.cyclename = cyclename;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
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

	public String getEndaccount() {
		return endaccount;
	}

	public void setEndaccount(String endaccount) {
		this.endaccount = endaccount;
	}

	public int getCycle() {
		return cycle;
	}

	public void setCycle(int cycle) {
		this.cycle = cycle;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getFilePics() {
		return filePics;
	}

	public void setFilePics(String filePics) {
		this.filePics = filePics;
	}

}
