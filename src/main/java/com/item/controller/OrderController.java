package com.item.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.item.alipay.AlipayBean;
import com.item.alipay.AlipayProperties;
import com.item.alipay.FlowModel;
import com.item.alipay.OrderFlow;
import com.item.entity.ModelBean;
import com.item.service.FlowServiceImpl;
import com.item.service.PayService;
import com.item.tool.JavaTool;
import com.item.tool.Result;

/**
 * 订单接口
 * 
 * @author Louis
 * @date Dec 12, 2018
 */

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	private PayService payService;

	private static final Logger log = LoggerFactory.getLogger(FlowServiceImpl.class);

	// 测试
	@RequestMapping(value = "buy")
	public String buy() {
		return "file";
	}

	/**
	 * 单个支付(支付宝)
	 * 
	 * @return
	 */
	@RequestMapping(value = "orderByOne")
	@ResponseBody
	public Result<?> orderByOne(String uid, String mid, String cycle, String paidmethod) throws AlipayApiException {
		ModelBean modelBean = payService.queryModelById(Integer.parseInt(mid));
		OrderFlow orderFlow = new OrderFlow();
		orderFlow.setOid(JavaTool.getUserId());
		orderFlow.setOrderstatus(0);
		orderFlow.setUid(uid);
		DecimalFormat df = new DecimalFormat("#.00");
		switch (Integer.parseInt(cycle)) {
		case 1:// 一个月
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice()));
			break;
		case 2:// 半年 九折
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice() * 6 * 0.9));
			break;
		case 3:// 一年 八折
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice() * 12 * 0.8));
			break;
		case 4:// 永久
			orderFlow.setOrderamount(df.format(modelBean.getModelprice()));
			break;
		default:
			break;
		}
		orderFlow.setMids(mid);
		orderFlow.setPaidmethod(Integer.parseInt(paidmethod));
		orderFlow.setMname(modelBean.getModelname());
		orderFlow.setStr1("1");// 走单个支付
		orderFlow.setCycle(Integer.parseInt(cycle));
		orderFlow.setCreatetime(JavaTool.getCurrent());
		return Result.success(payService.aliPayOne(orderFlow));
	}

	/**
	 * 单个支付(商城币)
	 * 
	 * @param uid
	 * @param mid
	 * @param cycle
	 * @param paidmethod
	 * @return
	 * @throws AlipayApiException
	 */
	@RequestMapping(value = "orderByThree")
	@ResponseBody
	public Result<?> orderByThree(String uid, String mid, String cycle, String paidmethod) throws AlipayApiException {
		ModelBean modelBean = payService.queryModelById(Integer.parseInt(mid));
		OrderFlow orderFlow = new OrderFlow();
		orderFlow.setOid(JavaTool.getUserId());
		orderFlow.setOrderstatus(0);
		orderFlow.setUid(uid);
		DecimalFormat df = new DecimalFormat("#.00");
		switch (Integer.parseInt(cycle)) {// 商城币在原来的基础上*10
		case 1:// 一个月
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice() * 10));
			break;
		case 2:// 半年 九折
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice() * 6 * 0.9 * 10));
			break;
		case 3:// 一年 八折
			orderFlow.setOrderamount(df.format(modelBean.getUnitprice() * 12 * 0.8 * 10));
			break;
		case 4:// 永久
			orderFlow.setOrderamount(df.format(modelBean.getModelprice() * 10));
			break;
		default:
			break;
		}
		orderFlow.setMids(mid);
		orderFlow.setPaidmethod(Integer.parseInt(paidmethod));
		orderFlow.setMname(modelBean.getModelname());
		orderFlow.setStr1("1");// 走单个支付
		orderFlow.setCycle(Integer.parseInt(cycle));
		orderFlow.setCreatetime(JavaTool.getCurrent());
		return payService.orderByThree(orderFlow);
	}

	/**
	 * 阿里支付
	 * 
	 * @param tradeNo
	 * @param subject
	 * @param amount
	 * @param body
	 * @return
	 * @throws AlipayApiException
	 */
	@RequestMapping(value = "alipay")
	@ResponseBody
	public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
		AlipayBean alipayBean = new AlipayBean();
		alipayBean.setOut_trade_no(outTradeNo);
		alipayBean.setSubject(subject);
		alipayBean.setTotal_amount(totalAmount);
		alipayBean.setBody(body);
		return payService.aliPay(alipayBean);
	}

	/**
	 * 异步通知
	 * 
	 * @return
	 */
	@RequestMapping(value = "notifyUrl")
	@ResponseBody
	public String notifyUrl(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.info("支付成功, 进入异步通知接口...");

		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用
//			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}

		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayProperties.getPublicKey(),
				AlipayProperties.getCharset(), AlipayProperties.getSignType());// 调用SDK验证签名

		// ——请在这里编写您的程序（以下代码仅作参考）——

		/*
		 * 实际验证过程建议商户务必添加以下校验： 1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		 * 2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额）， 3、校验通知中的seller_id（或者seller_email)
		 * 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
		 * 4、验证app_id是否为该商户本身。
		 */
		if (signVerified) {
			// 商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
			// 支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
			// 付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

			// 通过订单号查询订单信息
			OrderFlow orderFlow = payService.selectOrderFlowByOid(out_trade_no);
			orderFlow.setOrderstatus(1);
			// 修改订单信息
			orderFlow.setPaidtime(JavaTool.getCurrent());
			payService.updateOrderFlow(orderFlow);

			// 批量添加流水信息
			String str1 = orderFlow.getStr1();
			List<FlowModel> list = new ArrayList<FlowModel>();
			if (str1.equals("1")) {// 单个支付
				FlowModel flowModel = new FlowModel();
				flowModel.setFid(trade_no);
				flowModel.setUid(orderFlow.getUid());
				flowModel.setMid(Integer.parseInt(orderFlow.getMids()));
				flowModel.setEndaccount(total_amount);
				flowModel.setCycle(orderFlow.getCycle());
				flowModel.setStarttime(JavaTool.getCurrent());
				flowModel.setEndtime(JavaTool.getTime(orderFlow.getCycle()));
				payService.insertFlowModel(flowModel);
			} else if (str1.equals("2")) {// 多个支付 走购物车

			}
		} else {
			log.info("支付, 验签失败...");
		}
		return "success";
	}

	/**
	 * 同步通知
	 * 
	 * @return
	 */
	@RequestMapping(value = "returnUrl")
	public String returnUrl(HttpServletRequest request, HttpServletRequest response, String id) throws Exception {
		log.info("支付成功, 进入同步通知接口...");

		return "jump";
		// 获取支付宝GET过来反馈信息
//		Map<String, String> params = new HashMap<String, String>();
//		Map<String, String[]> requestParams = request.getParameterMap();
//		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
//			String name = (String) iter.next();
//			String[] values = (String[]) requestParams.get(name);
//			String valueStr = "";
//			for (int i = 0; i < values.length; i++) {
//				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
//			}
//			// 乱码解决，这段代码在出现乱码时使用
//			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
//			params.put(name, valueStr);
//		}
//
//		boolean signVerified = false;
//		try {
//			signVerified = AlipaySignature.rsaCheckV1(params, AlipayProperties.getPublicKey(),
//					AlipayProperties.getCharset(), AlipayProperties.getSignType()); // 调用SDK验证签名
//		} catch (Exception e) {
//			System.out.println("SDK验证签名出现异常");
//		}
//
//		if (signVerified) {
//			// 商户订单号
//			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
//
//			// 支付宝交易号
//			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
//
//			// 付款金额
//			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
//
//		} else {
//			log.info("支付, 验签失败...");
//		}
		// return "支付你好";
	}

}