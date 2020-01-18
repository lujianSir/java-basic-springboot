package com.item.entity;

import java.io.Serializable;
/**
 * 后台管理模块目录结构
 * @author Administrator
 *
 */
public class Power implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//id
	private int  id;
	
	//父ID
	private int pid;
	
	//名称
	private String name;
	
	//地址
	private String url;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
