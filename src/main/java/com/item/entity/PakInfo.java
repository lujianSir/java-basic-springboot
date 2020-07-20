package com.item.entity;

import java.io.Serializable;

public class PakInfo implements Serializable {

	private String pakgamepath;

	private String pakname;// pak名称

	private String pakdownloadpath;// pak路径

	private String type;// 类型

	private String pakpicturepath;// 图片地址

	private String classname;// 类别

	private String remark;// 评论

	private String displayname;// 名称

	private int modelstyle;

	public int getModelstyle() {
		return modelstyle;
	}

	public void setModelstyle(int modelstyle) {
		this.modelstyle = modelstyle;
	}

	public String getPakgamepath() {
		return pakgamepath;
	}

	public void setPakgamepath(String pakgamepath) {
		this.pakgamepath = pakgamepath;
	}

	public String getPakname() {
		return pakname;
	}

	public void setPakname(String pakname) {
		this.pakname = pakname;
	}

	public String getPakdownloadpath() {
		return pakdownloadpath;
	}

	public void setPakdownloadpath(String pakdownloadpath) {
		this.pakdownloadpath = pakdownloadpath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPakpicturepath() {
		return pakpicturepath;
	}

	public void setPakpicturepath(String pakpicturepath) {
		this.pakpicturepath = pakpicturepath;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

}
