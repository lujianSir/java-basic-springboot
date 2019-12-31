package com.item.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 支付接口
 */
public interface AlipayService {

    /**
     * web端订单支付
     * @param outTradeNo    订单编号（唯一）
     * @param totalAmount   订单价格
     * @param subject       商品名称
     */
    public String webPagePay(String outTradeNo,Integer totalAmount,String subject);
    
    /**
     * @Description: 校验签名
     * @param request
     */
    public boolean rsaCheckV1(HttpServletRequest request);
    
    
    /**
     * @Description:
     * @param tradeStatus: 支付宝交易状态
     * @param orderNo: 订单编号
     * @param tradeNo: 支付宝订单号
     * @Author: 
     * @return 
     */
    boolean notify(String tradeStatus, String orderNo, String tradeNo);
    
    
    
    
}
