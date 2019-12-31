package com.item.service;

import java.sql.Date;

import com.item.entity.FlowBean;
import com.item.tool.Result;

public interface FlowService {

	// 判断流程编号是否存在
	public boolean flowExist(long flownum);

	// 判断审批编号是否存在
	public boolean approveExist(long approvenum);

	// 创建流程
	public Result<?> flowAdd(FlowBean flow);

	// 查询出所有表中的数据,提供筛选功能
	public Result<?> flowQuery(int node, long flownum, Date startDate, Date endDate);

	// 根据流程编号查询出所有的审核
	public Result<?> approveQuery(long flownum);

}
