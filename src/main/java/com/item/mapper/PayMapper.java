package com.item.mapper;

import com.item.alipay.FlowModel;
import com.item.alipay.OrderFlow;

public interface PayMapper {
	
	/**
	 * 生成订单列表
	 * @param orderFlow
	 */
	public void insertOrderFlow(OrderFlow orderFlow);
	
	 //通过ID查询订单信息
    public OrderFlow selectOrderFlowByOid(String oid);
    
    //修改订单列表
    public void updateOrderFlow(OrderFlow orderFlow);
    
  //添加流水信息
    public void insertFlowModel(FlowModel flowModel);
}
