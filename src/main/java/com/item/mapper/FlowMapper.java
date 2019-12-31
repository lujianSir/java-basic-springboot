package com.item.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.item.entity.ApproveBean;
import com.item.entity.FlowBean;

@Repository
public interface FlowMapper {

	// 判断流程编号是否存在
	public int flowExist(long flownum);

	// 判断审批编号是否存在
	public int approveExist(long approvenum);

	// 创建流程
	public void flowAdd(FlowBean flow);

	// 创建流程
	public void approveAdd(ApproveBean approve);


	// 查询出所有表中的数据,提供筛选功能
	public List<FlowBean> flowQuery(@Param("node") int node, @Param("flownum") long flownum,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);
	
	//根据流程编号查询出所有的审核
	public List<ApproveBean> approveQuery(long flownum);

}
