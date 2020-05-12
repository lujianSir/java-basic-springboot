package com.item.entity;

public class IndustryModel {

	private int id;// ID

	private int mid;// 模型ID

	private String modelname;// 模型名称

	private int style;// 类型 1 勾选 0 没有勾选

	private int otherstyle;// 1 勾选 2 没有勾选

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
