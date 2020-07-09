package com.item.entity;

import java.io.Serializable;

public class VacUser implements Serializable {

	private String nickname;// 名称

	private String datimename;// 日期

	private boolean flag = false;// 状态判断

	private int style = 2;// 状态

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDatimename() {
		return datimename;
	}

	public void setDatimename(String datimename) {
		this.datimename = datimename;
	}

}
