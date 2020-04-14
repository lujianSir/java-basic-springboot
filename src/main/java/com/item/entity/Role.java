package com.item.entity;

public class Role {

	private int id;// 角色对应的ID

	private String name;// 角色对应的名称

	private String remark;// 角色对应的备注信息

	private String creattime;// 创建的时间

	public String getCreattime() {
		return creattime;
	}

	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
