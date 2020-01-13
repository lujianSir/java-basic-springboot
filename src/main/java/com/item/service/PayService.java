package com.item.service;

import java.util.List;

import com.alipay.api.AlipayApiException;
import com.item.alipay.AlipayBean;
import com.item.alipay.FlowModel;
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
    
    //通过ID查询订单信息
    public OrderFlow selectOrderFlowByOid(String oid);
    
    //修改订单列表
    public void updateOrderFlow(OrderFlow orderFlow);
    
    //添加流水信息
    public void insertFlowModel(FlowModel flowModel);
    
  //通过用户ID查询已购买的模型
    public List<FlowModel>  selectFlowModelByUserId(String uid);
}
