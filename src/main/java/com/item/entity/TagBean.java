package com.item.entity;

import java.io.Serializable;

/**
 * 用来处理页面标签
 * 
 * @author
 *
 */

public class TagBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -833491664501890240L;

	// ID
	private int id;

	// 父节点
	private int pid; // 一级 默认父ID为0

	// 标题类型
	private String typeclass;

	// 标题名称
	private String typename;

	// 标题对应的内容
	private String content;

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

	public String getTypeclass() {
		return typeclass;
	}

	public void setTypeclass(String typeclass) {
		this.typeclass = typeclass;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
