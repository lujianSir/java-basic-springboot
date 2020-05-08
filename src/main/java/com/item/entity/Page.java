package com.item.entity;

import java.util.List;

public class Page {

	// 当前页
	private int pageNumber;

	// 每页显示多少条
	private int pageSize;

	private int total;// 总数

	private List<?> list;

	private int pageStart;// 开始多少页

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageNumber) {
		this.pageStart = (pageNumber - 1) * pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
