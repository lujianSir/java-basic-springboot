package com.item.entity;

import java.io.Serializable;

/**
 * 处理文件
 * 
 * @author hjy
 *
 */
public class FileBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4296341561794490100L;

	// 目录ID
	private String id;
	// 目录名称
	private String catalog;
	// 文件路径
	private String fileurl;
	// 上传时间
	private String uploadtime;
	// 上传角色身份 目前两个 0代表前台 1代表模型端
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

	public String getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
