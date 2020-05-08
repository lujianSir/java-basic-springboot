package com.item.entity;

/**
 * 上传表的数据
 * 
 * @author Administrator
 *
 */
public class ExcelManage {

	private String eid;// 表格的iD

	private String uid;// 上传的人

	private String username;

	private String nickname;

	private String creattime;// 上传的时间

	private String excelname;// 文件名称

	private String realpath;// 文件上传的实际路径

	private int excelstatus;// 1 显示提交申请 2 正在审批 3.审批拒绝 4. 审批通过

	private String processInstanceId;// 流程ID

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getExcelstatus() {
		return excelstatus;
	}

	public void setExcelstatus(int excelstatus) {
		this.excelstatus = excelstatus;
	}

	public String getRealpath() {
		return realpath;
	}

	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCreattime() {
		return creattime;
	}

	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

	public String getExcelname() {
		return excelname;
	}

	public void setExcelname(String excelname) {
		this.excelname = excelname;
	}

}
