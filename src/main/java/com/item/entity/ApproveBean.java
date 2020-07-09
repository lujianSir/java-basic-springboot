package com.item.entity;

import java.io.Serializable;
import java.sql.Date;

public class ApproveBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4423854815836182561L;

	// 审批编号
	private long approvenum;
	// 审批人
	private String approver;
	// 审批状态
	private int status;
	// 审批时间
	private Date approvetime;
	// 流程申请人
	private String proposer;
	// 备注
	private String remark;
	// 流程单号
	private long flownum;

	public long getApprovenum() {
		return approvenum;
	}

	public void setApprovenum(long approvenum) {
		this.approvenum = approvenum;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getApprovetime() {
		return approvetime;
	}

	public void setApprovetime(Date approvetime) {
		this.approvetime = approvetime;
	}

	public String getProposer() {
		return proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getFlownum() {
		return flownum;
	}

	public void setFlownum(long flownum) {
		this.flownum = flownum;
	}

}
