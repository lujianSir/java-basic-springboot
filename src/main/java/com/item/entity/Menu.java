package com.item.entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	// ID
	private int id;

	// 父节点
	private int pid; // 一级 默认父ID为0

	// 标题名称
	private String rname;

	private List<Menu> children = new ArrayList<Menu>();

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

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

}
