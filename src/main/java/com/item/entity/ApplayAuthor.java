package com.item.entity;

import java.io.Serializable;

public class ApplayAuthor implements Serializable {

	private String applyid;// 发起的ID

	private String authorid;// 审批ID

	public String getApplyid() {
		return applyid;
	}

	public void setApplyid(String applyid) {
		this.applyid = applyid;
	}

	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

}
