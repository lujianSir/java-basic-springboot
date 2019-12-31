package com.item.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class FlowBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3165842400028527542L;
	// 流程编号
	private long flownum;
	// 流程人
	private String proposer;
	// 流程发起时间
	private Date flowtime;
	// 流程节点
	private int node;
	//备注
	private String remark;
	//表单名称
	private String formname;
	//文件地址
	private String filepath;
	//用于判断数据是否需要被审批
	private int isapprove;
	

	public long getFlownum() {
		return flownum;
	}

	public void setFlownum(long flownum) {
		this.flownum = flownum;
	}

	public String getProposer() {
		return proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public int getNode() {
		return node;
	}

	public void setNode(int node) {
		this.node = node;
	}

	public Date getFlowtime() {
		return flowtime;
	}

	public void setFlowtime(Date flowtime) {
		this.flowtime = flowtime;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFormname() {
		return formname;
	}

	public void setFormname(String formname) {
		this.formname = formname;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public int getIsapprove() {
		return isapprove;
	}

	public void setIsapprove(int isapprove) {
		this.isapprove = isapprove;
	}

}
