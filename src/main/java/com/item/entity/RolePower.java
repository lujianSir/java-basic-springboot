package com.item.entity;

import java.io.Serializable;

public class RolePower implements Serializable {

	private int powerid;// 权限ID

	private int roleid;// 角色ID

	public int getPowerid() {
		return powerid;
	}

	public void setPowerid(int powerid) {
		this.powerid = powerid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

}
