package com.item.mapper;

import com.item.alipay.OrderFlow;

public interface PayMapper {
	
	/**
	 * 生成订单列表
	 * @param orderFlow
	 */
	public void insertOrderFlow(OrderFlow orderFlow);
}
