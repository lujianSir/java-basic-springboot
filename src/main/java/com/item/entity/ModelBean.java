package com.item.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class ModelBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5275731141905140281L;
	
	//模型ID
	private int mid;
	
	// 模型名称
	private String modelname;
	// 模型价格
	private double modelprice;
	// 构建类型
	private String buildtype;
	// 资源库类型一级
	private String resource_one;
	// 资源库类型二级
	private String resource_two;
	// 文件名称
	private String filename;
	// 模型描述
	private String describe;
	
	
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public double getModelprice() {
		return modelprice;
	}
	public void setModelprice(double modelprice) {
		this.modelprice = modelprice;
	}
	public String getBuildtype() {
		return buildtype;
	}
	public void setBuildtype(String buildtype) {
		this.buildtype = buildtype;
	}
	public String getResource_one() {
		return resource_one;
	}
	public void setResource_one(String resource_one) {
		this.resource_one = resource_one;
	}
	public String getResource_two() {
		return resource_two; 
	}
	public void setResource_two(String resource_two) {
		this.resource_two = resource_two;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	
}
