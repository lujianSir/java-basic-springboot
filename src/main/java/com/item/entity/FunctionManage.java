package com.item.entity;

import java.io.Serializable;

/**
 * 功能次数管理
 * 
 * @author Administrator
 *
 */
public class FunctionManage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int frid;//

	private String username;// 每个账号

	private String functionname;// 功能名称

	private int functiontime;// 功能次数

	private String lasttime;// 最后一次操作时间

	public int getFrid() {
		return frid;
	}

	public void setFrid(int frid) {
		this.frid = frid;
	}

	public String getLasttime() {
		return lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFunctionname() {
		return functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public int getFunctiontime() {
		return functiontime;
	}

	public void setFunctiontime(int functiontime) {
		this.functiontime = functiontime;
	}

}
