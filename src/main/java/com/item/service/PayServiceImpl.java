package com.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.item.alipay.AlipayBean;
import com.item.alipay.AlipayProperties;
import com.item.alipay.FlowModel;
import com.item.alipay.OrderFlow;
import com.item.entity.ModelBean;
import com.item.entity.UserMessage;
import com.item.mapper.FileMapper;
import com.item.mapper.PayMapper;
import com.item.mapper.UserMapper;
import com.item.tool.JavaTool;
import com.item.tool.Result;

@Service
public class PayServiceImpl implements PayService {

	@Autowired
	private FileMapper fileMapper;

	@Autowired
	private PayMapper payMapper;

	@Autowired
	private UserMapper userMapper;

	@Override
	public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
		// 1、获得初始化的AlipayClient
		String serverUrl = AlipayProperties.getGatewayUrl();
		String appId = AlipayProperties.getAppId();
		String privateKey = AlipayProperties.getPrivateKey();
		String format = "json";
		String charset = AlipayProperties.getCharset();
		String alipayPublicKey = AlipayProperties.getPublicKey();
		String signType = AlipayProperties.getSignType();
		String returnUrl = AlipayProperties.getReturnUrl();
		String notifyUrl = AlipayProperties.getNotifyUrl();
		AlipayClient alipayClient = new DefaultAlipayClient(serverUrl, appId, privateKey, format, charset,
				alipayPublicKey, signType);
		// 2、设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		// 页面跳转同步通知页面路径
		alipayRequest.setReturnUrl(returnUrl);
		// 服务器异步通知页面路径
		alipayRequest.setNotifyUrl(notifyUrl);
		// 封装参数
		alipayRequest.setBizContent(JSON.toJSONString(alipayBean));
		// 3、请求支付宝进行付款，并获取支付结果
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		// 返回付款信息
		System.out.println(result);
		return result;
	}

	@Override
	public ModelBean queryModelById(int mid) {
		// TODO Auto-generated method stub
		return fileMapper.queryModelById(mid);
	}

	@Override
	public String aliPayOne(OrderFlow orderFlow) throws AlipayApiException {
		// TODO Auto-generated method stub
		payMapper.insertOrderFlow(orderFlow); // 生成订单并且调用支付宝支付
		AlipayBean alipayBean = new AlipayBean();
		alipayBean.setOut_trade_no(orderFlow.getOid());
		alipayBean.setSubject(orderFlow.getMname());
		alipayBean.setTotal_amount(orderFlow.getOrderamount());
		alipayBean.setBody("");
		// 1、获得初始化的AlipayClient
		String serverUrl = AlipayProperties.getGatewayUrl();
		String appId = AlipayProperties.getAppId();
		String privateKey = AlipayProperties.getPrivateKey();
		String format = "json";
		String charset = AlipayProperties.getCharset();
		String alipayPublicKey = AlipayProperties.getPublicKey();
		String signType = AlipayProperties.getSignType();
		String returnUrl = AlipayProperties.getReturnUrl();
		String notifyUrl = AlipayProperties.getNotifyUrl();
		AlipayClient alipayClient = new DefaultAlipayClient(serverUrl, appId, privateKey, format, charset,
				alipayPublicKey, signType);
		// 2、设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		returnUrl = returnUrl + "?id=" + orderFlow.getMids();
		// 页面跳转同步通知页面路径
		alipayRequest.setReturnUrl(returnUrl);
		// 服务器异步通知页面路径
		alipayRequest.setNotifyUrl(notifyUrl);
		// 封装参数
		alipayRequest.setBizContent(JSON.toJSONString(alipayBean));
		// 3、请求支付宝进行付款，并获取支付结果
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		// 返回付款信息
		System.out.println(result);
		return result;
	}

	@Override
	public OrderFlow selectOrderFlowByOid(String oid) {
		// TODO Auto-generated method stub
		return payMapper.selectOrderFlowByOid(oid);
	}

	@Override
	public void updateOrderFlow(OrderFlow orderFlow) {
		// TODO Auto-generated method stub
		payMapper.updateOrderFlow(orderFlow);
	}

	@Override
	public void insertFlowModel(FlowModel flowModel) {
		// TODO Auto-generated method stub
		payMapper.insertFlowModel(flowModel);
	}

	@Override
	public List<FlowModel> selectFlowModelByUserId(String uid) {
		// TODO Auto-generated method stub
		return payMapper.selectFlowModelByUserId(uid);
	}

	@Override
	public Result<?> orderByThree(OrderFlow orderFlow) {
		// TODO Auto-generated method stub
		payMapper.insertOrderFlow(orderFlow); // 生成订单
		UserMessage userMessage = userMapper.queryUserMessageByUserId(orderFlow.getUid());
		Double obj1 = Double.parseDouble(orderFlow.getOrderamount());// 需要的钱
		Double obj2 = userMessage.getAccount();// 本身的钱
		int retval = obj1.compareTo(obj2);
		if (retval > 0) {// 需要的钱多
			return Result.error(500, "商城币不够");
		} else {// 本身的钱多或者刚刚好
			Double dou = JavaTool.sub(obj2, obj1);// 剩余的钱
			orderFlow.setOrderstatus(1);
			// 修改订单信息
			orderFlow.setPaidtime(JavaTool.getCurrent());
			payMapper.updateOrderFlow(orderFlow);// 修改订单信息
			userMessage.setAccount(dou);
			userMapper.updateUserMessage(userMessage);// 修改用户钱的信息

			FlowModel flowModel = new FlowModel();
			flowModel.setFid(orderFlow.getOid());
			flowModel.setUid(orderFlow.getUid());
			flowModel.setMid(Integer.parseInt(orderFlow.getMids()));
			flowModel.setEndaccount(obj1.toString());
			flowModel.setCycle(orderFlow.getCycle());
			flowModel.setStarttime(JavaTool.getCurrent());
			flowModel.setEndtime(JavaTool.getTime(orderFlow.getCycle()));
			payMapper.insertFlowModel(flowModel);
			return Result.success();
		}
	}

}