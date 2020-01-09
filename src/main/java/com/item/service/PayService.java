package com.item.service;

import com.alipay.api.AlipayApiException;
import com.item.alipay.AlipayBean;
import com.item.alipay.OrderFlow;
import com.item.entity.ModelBean;

public interface PayService {

	  /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
    
    
    //通过ID查询模型的信息
    public ModelBean queryModelById(int mid);
    
    /**
     * 单个商品生成订单并且支付
     * @param orderFlow
     * @return
     * @throws AlipayApiException
     */
    public String aliPayOne(OrderFlow orderFlow) throws AlipayApiException;
}
