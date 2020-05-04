package com.item.entity;

/**
 * 评论
 * 
 * @author Administrator
 *
 */
public class StarClass {

	private int sid;// 评论ID

	private String uid;// 评论用户

	private int star;// 评论多少分

	private int mid;// 评论的商品ID

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

}
