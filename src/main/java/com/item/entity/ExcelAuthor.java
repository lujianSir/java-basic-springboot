package com.item.entity;

import java.io.Serializable;

/**
 * 流程审批
 * 
 * @author Administrator
 *
 */
public class ExcelAuthor implements Serializable {

	private String authorid;// 审批ID

	private String authorname;// 审批人

	private String authorreson;// 审批原因

	private String authortime;// 审批时间

	private int authorstatus;// 审批状态 1还没有开始 2 正在进行 3审批驳回 4.审批通过

	private int number;// 排序

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthorreson() {
		return authorreson;
	}

	public void setAuthorreson(String authorreson) {
		this.authorreson = authorreson;
	}

	public String getAuthortime() {
		return authortime;
	}

	public void setAuthortime(String authortime) {
		this.authortime = authortime;
	}

	public int getAuthorstatus() {
		return authorstatus;
	}

	public void setAuthorstatus(int authorstatus) {
		this.authorstatus = authorstatus;
	}

}
