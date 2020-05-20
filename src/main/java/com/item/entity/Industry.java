package com.item.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 行业
 * 
 * @author Administrator
 *
 */
public class Industry {

	private int id;// 行业ID

	private String iname;// 行业的名称

	private int pid;// 父ID

	private List<Industry> childrens = new ArrayList<Industry>();;// 含的子类

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public List<Industry> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Industry> childrens) {
		this.childrens = childrens;
	}

}
