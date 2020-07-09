package com.item.entity;

import java.io.Serializable;

public class IndustryModel implements Serializable {

	private int id;// ID

	private int mid;// 模型ID

	private String modelname;// 模型名称

	private String modelpic;// 模型图片

	private String creattime;// 创建时间

	private String creatname;// 创建人

	private int style;// 类型 1 勾选 0 没有勾选

	private int otherstyle;// 1 勾选 2 没有勾选

	public String getModelpic() {
		return modelpic;
	}

	public void setModelpic(String modelpic) {
		this.modelpic = modelpic;
	}

	public String getCreattime() {
		return creattime;
	}

	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

	public String getCreatname() {
		return creatname;
	}

	public void setCreatname(String creatname) {
		this.creatname = creatname;
	}

	public int getOtherstyle() {
		return otherstyle;
	}

	public void setOtherstyle(int otherstyle) {
		this.otherstyle = otherstyle;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

}
