package com.item.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

/**
 * 处理文件
 * 
 * @author hjy
 *
 */
@Entity
public class FileBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4296341561794490100L;
	
	// 目录ID
	private int id;
	// 目录名称
	private String catalog;
	// 文件路径
	private String fileurl;
	// 上传时间
	private Date uploadtime;
	// 上传角色身份  目前两个  0代表前台   1代表模型端
	private int role;
	
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public String getFileurl() {
		return fileurl;
	}
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	public Date getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
