package com.item.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * 用来处理页面标签
 * 
 * @author hjy
 *
 */
@Entity
public class TagBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -833491664501890240L;

	// 标题名称
	private String typeName;
	// 标题类型
	private String typeClass;
	// 父节点
	private int parentid;
	// 子节点
	private int nodeid;
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeClass() {
		return typeClass;
	}
	public void setTypeClass(String typeClass) {
		this.typeClass = typeClass;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getNodeid() {
		return nodeid;
	}
	public void setNodeid(int nodeid) {
		this.nodeid = nodeid;
	}
	
	@Override
	public String toString() {
		return "Tag [typeName=" + typeName + ", typeClass=" + typeClass + ", parentid=" + parentid + ", nodeid="
				+ nodeid + "]";
	}

}
