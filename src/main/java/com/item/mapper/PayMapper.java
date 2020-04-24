package com.item.mapper;

import java.util.List;

import com.item.alipay.FlowModel;
import com.item.alipay.OrderFlow;

public interface PayMapper {

	/**
	 * 生成订单列表
	 * 
	 * @param orderFlow
	 */
	public void insertOrderFlow(OrderFlow orderFlow);

	// 通过ID查询订单信息
	public OrderFlow selectOrderFlowByOid(String oid);

	// 修改订单列表
	public void updateOrderFlow(OrderFlow orderFlow);

	// 添加流水信息
	public void insertFlowModel(FlowModel flowModel);

	// 通过用户ID查询已购买的模型
	public List<FlowModel> selectFlowModelByUserId(String uid);

	// 修改状态不为new
	public void updateFlowModelByUserIdAndMid(FlowModel flowModel);

	/**
	 * 购买记录
	 * 
	 * @param flowModel
	 * @return
	 */
	public List<OrderFlow> getLoadBuy(OrderFlow rderFlow);
}
