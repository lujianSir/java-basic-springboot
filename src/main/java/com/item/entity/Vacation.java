package com.item.entity;

import java.util.Date;

/**
 * @author Created by yawn on 2018-01-08 16:44
 */
public class Vacation implements Comparable<Vacation> {

	/**
	 * 申请人
	 */
	private String applyUser;// 申请人
	private String title;// 申请的标题
	private String reason;// 申请的原因
	private Date applyTime;// 申请的时间
	private String applyTimename;// 申请时间
	private String applyStatus;// 申请状态 正在申请或者申请结束 1、正在审批中 2. 审批成功 3.审批失败

	private String firstName;// 第一审批人
	private String secondName;// 第二审批人

	private String processInstanceId;// 流程ID

	/**
	 * 审核人
	 */
	private String auditor;// 审核人
	private String result;// 审核结果 审核拒绝或者审核通过
	private Date auditTime;// 审核的时间
	private String auditTimename;// 时间
	private String auditorremark;// 评论

	public String getApplyTimename() {
		return applyTimename;
	}

	public void setApplyTimename(String applyTimename) {
		this.applyTimename = applyTimename;
	}

	public String getAuditTimename() {
		return auditTimename;
	}

	public void setAuditTimename(String auditTimename) {
		this.auditTimename = auditTimename;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditorremark() {
		return auditorremark;
	}

	public void setAuditorremark(String auditorremark) {
		this.auditorremark = auditorremark;
	}

	@Override
	public int compareTo(Vacation o) {
		// TODO Auto-generated method stub
		return this.applyTime.compareTo(o.getApplyTime());
	}

}
