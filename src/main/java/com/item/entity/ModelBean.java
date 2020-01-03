package com.item.entity;

import java.io.Serializable;
import java.util.Date;

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
	// 模型图片地址
	private String filePics;
	
	//模型地址
	private String fileModel;
	
	// 模型描述
	private String describe;
	
	//下载数量
	private int download;
	
	//星级
	private int starclass;
	
	//上传时间
	private Date creatTime;
	
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
		
	public String getFilePics() {
		return filePics;
	}
	public void setFilePics(String filePics) {
		this.filePics = filePics;
	}
	public String getFileModel() {
		return fileModel;
	}
	public void setFileModel(String fileModel) {
		this.fileModel = fileModel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public int getStarclass() {
		return starclass;
	}
	public void setStarclass(int starclass) {
		this.starclass = starclass;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
}