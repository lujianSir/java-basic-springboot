package com.item.entity;

import java.io.Serializable;

/**
 * 用来处理页面标签
 * 
 * @author
 *
 */
public class ResourceInfo implements Serializable {

	// ID
	private int id;

	// 父节点
	private int pid; // 一级 默认父ID为0

	// 标题名称
	private String rname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

}
