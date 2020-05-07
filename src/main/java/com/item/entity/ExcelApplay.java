package com.item.entity;

import java.util.List;

/**
 * 流程发起
 * 
 * @author Administrator
 *
 */
public class ExcelApplay {

	private String applyid;// 发起的ID

	private String applyname;// 发起人

	private String excelname;// 发起的文件名称

	private String applyreson;// 发起原因

	private String applycreattime;// 发起时间

	private int applystatus;// 审批状态 1还没有开始 2 正在进行 3审批驳回 4.审批通过

	private String applystatusname;// 状态名称

	private List<ExcelAuthor> excelAuthors; // 审批人

	private List<ExcelAuthor> excelMessages;// 审批信息

	private String authornames;// 审批人

	public String getAuthornames() {
		return authornames;
	}

	public void setAuthornames(String authornames) {
		this.authornames = authornames;
	}

	public List<ExcelAuthor> getExcelMessages() {
		return excelMessages;
	}

	public void setExcelMessages(List<ExcelAuthor> excelMessages) {
		this.excelMessages = excelMessages;
	}

	public String getApplystatusname() {
		return applystatusname;
	}

	public void setApplystatusname(String applystatusname) {
		this.applystatusname = applystatusname;
	}

	public List<ExcelAuthor> getExcelAuthors() {
		return excelAuthors;
	}

	public void setExcelAuthors(List<ExcelAuthor> excelAuthors) {
		this.excelAuthors = excelAuthors;
	}

	public String getApplyname() {
		return applyname;
	}

	public void setApplyname(String applyname) {
		this.applyname = applyname;
	}

	public String getExcelname() {
		return excelname;
	}

	public void setExcelname(String excelname) {
		this.excelname = excelname;
	}

	public String getApplyreson() {
		return applyreson;
	}

	public void setApplyreson(String applyreson) {
		this.applyreson = applyreson;
	}

	public String getApplycreattime() {
		return applycreattime;
	}

	public void setApplycreattime(String applycreattime) {
		this.applycreattime = applycreattime;
	}

	public String getApplyid() {
		return applyid;
	}

	public void setApplyid(String applyid) {
		this.applyid = applyid;
	}

	public int getApplystatus() {
		return applystatus;
	}

	public void setApplystatus(int applystatus) {
		this.applystatus = applystatus;
	}

}
