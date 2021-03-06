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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.alipay.AlipayBean;
import com.item.alipay.AlipayProperties;
import com.item.alipay.FlowModel;
import com.item.alipay.OrderFlow;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.entity.ShoppingCart;
import com.item.service.FlowServiceImpl;
import com.item.service.PayService;
import com.item.service.ShoppingService;
import com.item.tool.JavaTool;
import com.item.tool.Result;
import com.item.tool.Utils;

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

	@Autowired
	private ShoppingService shoppingService;

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
	public Result<?> orderByOne(String uid, String mid, String cycle, String paidmethod, String str, String sid)
			throws AlipayApiException {
		if (str.equals("1")) {
			OrderFlow orderFlow = changeOrderFlow(uid, mid, cycle, paidmethod);
			orderFlow.setStr1(str);// 走单个支付
			return Result.success(payService.aliPayOne(orderFlow));
		} else {// 购物车支付
			List<OrderFlow> list = new ArrayList<OrderFlow>();
			if (sid != null && !sid.equals("")) {
				String[] sids = sid.split(",");
				for (int i = 0; i < sids.length; i++) {
					String s = sids[i];
					ShoppingCart shoppingCart = shoppingService.queryShoppingCartBySid(s);
					OrderFlow orderFlow = changeOrderFlow(uid, shoppingCart.getMid() + "", shoppingCart.getCycle() + "",
							paidmethod);
					orderFlow.setStr1(str);
					list.add(orderFlow);
				}
			}
			return Result.success(payService.aliPayMany(list));
		}

	}

	/**
	 * 生成订单状态
	 * 
	 * @param uid
	 * @param mid
	 * @param cycle
	 * @param paidmethod
	 * @return
	 */
	public OrderFlow changeOrderFlow(String uid, String mid, String cycle, String paidmethod) {
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
		orderFlow.setCycle(Integer.parseInt(cycle));
		orderFlow.setCreatetime(JavaTool.getCurrent());
		return orderFlow;
	}

	/**
	 * 获取钱
	 * 
	 * @return
	 */
	@RequestMapping(value = "getMoney")
	@ResponseBody
	public Result<?> getMoney(String mid, String cycle, String paidmethod) {
		String money = "";
		ModelBean modelBean = payService.queryModelById(Integer.parseInt(mid));
		String st = "";
		if (cycle.equals("4")) {
			st = modelBean.getModelprice() + "";
		} else {
			st = modelBean.getUnitprice() + "";
		}

		if (st.equals("0.0")) {
			money = 0 + "";
		} else {
			DecimalFormat df = new DecimalFormat("#.00");

			if (paidmethod.equals("3")) {
				switch (Integer.parseInt(cycle)) {
				case 1:// 一个月
					money = df.format(modelBean.getUnitprice() * 10);
					break;
				case 2:// 半年 九折
					money = df.format(modelBean.getUnitprice() * 6 * 0.9 * 10);
					break;
				case 3:// 一年 八折
					money = df.format(modelBean.getUnitprice() * 12 * 0.8 * 10);
					break;
				case 4:// 永久
					money = df.format(modelBean.getModelprice() * 10);
					break;
				default:
					break;
				}
			} else {
				switch (Integer.parseInt(cycle)) {
				case 1:// 一个月
					money = df.format(modelBean.getUnitprice());
					break;
				case 2:// 半年 九折
					money = df.format(modelBean.getUnitprice() * 6 * 0.9);
					break;
				case 3:// 一年 八折
					money = df.format(modelBean.getUnitprice() * 12 * 0.8);
					break;
				case 4:// 永久
					money = df.format(modelBean.getModelprice());
					break;
				default:
					break;
				}
			}
		}

		return Result.success(money);
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
	public Result<?> orderByThree(String uid, String mid, String cycle, String paidmethod, String str, String sid)
			throws AlipayApiException {
		if (str.equals("1")) {
			OrderFlow orderFlow = changeOrderFlowShop(uid, mid, cycle, paidmethod);
			orderFlow.setStr1(str);// 走单个支付
			return payService.orderByThree(orderFlow);
		} else {// 购物车支付
			List<OrderFlow> list = new ArrayList<OrderFlow>();
			if (sid != null && !sid.equals("")) {
				String[] sids = sid.split(",");
				for (int i = 0; i < sids.length; i++) {
					String s = sids[i];
					ShoppingCart shoppingCart = shoppingService.queryShoppingCartBySid(s);
					OrderFlow orderFlow = changeOrderFlowShop(uid, shoppingCart.getMid() + "",
							shoppingCart.getCycle() + "", paidmethod);
					orderFlow.setStr1(str);
					list.add(orderFlow);
				}
			}
			return payService.orderByThreeMany(list);
		}
	}

	public OrderFlow changeOrderFlowShop(String uid, String mid, String cycle, String paidmethod) {
		ModelBean modelBean = payService.queryModelById(Integer.parseInt(mid));
		OrderFlow orderFlow = new OrderFlow();
		orderFlow.setOid(JavaTool.getUserId());
		orderFlow.setOrderstatus(0);
		orderFlow.setUid(uid);
		DecimalFormat df = new DecimalFormat("#.00");
		switch (Integer.parseInt(cycle)) {
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
		orderFlow.setCycle(Integer.parseInt(cycle));
		orderFlow.setCreatetime(JavaTool.getCurrent());
		return orderFlow;
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

			String body = new String(request.getParameter("body").getBytes("ISO-8859-1"), "UTF-8");
			// 付款金额
			// String total_amount = new
			// String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

			if (body != null && !body.equals("")) {
				String[] out_trade_nos = body.split(",");
				for (int i = 0; i < out_trade_nos.length; i++) {
					String out_trade = out_trade_nos[i];
					// 通过订单号查询订单信息
					OrderFlow orderFlow = payService.selectOrderFlowByOid(out_trade);
					orderFlow.setOrderstatus(1);
					orderFlow.setPaidtime(Utils.getCurrent());
					payService.updateOrderFlow(orderFlow);
					// 批量添加流水信息
					FlowModel flowModel = changeFlowModel(orderFlow, trade_no);

					FlowModel f = payService.queryFlowModel(flowModel);
					if (f == null) {
						payService.insertFlowModel(flowModel);
					} else {
						payService.updateFlowModel(flowModel);
					}
					// payService.insertFlowModel(flowModel);

					// 删除购物的信息
					shoppingService.deleteShopCartByUserIdAndMid(orderFlow);

				}
			}

		} else {
			log.info("支付, 验签失败...");
		}
		return "success";
	}

	public FlowModel changeFlowModel(OrderFlow orderFlow, String trade_no) {
		FlowModel flowModel = new FlowModel();
		flowModel.setFid(trade_no);
		flowModel.setUid(orderFlow.getUid());
		flowModel.setMid(Integer.parseInt(orderFlow.getMids()));
		flowModel.setEndaccount(orderFlow.getOrderamount());
		flowModel.setCycle(orderFlow.getCycle());
		flowModel.setStarttime(JavaTool.getCurrent());
		flowModel.setEndtime(JavaTool.getTime(orderFlow.getCycle()));
		flowModel.setSaynew(1);
		flowModel.setCreattime(Utils.getCurrent());
		return flowModel;
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

	/**
	 * 修改已购状态
	 * 
	 * @param orderFlow
	 * @return
	 */
	@RequestMapping(value = "/updateFlowModelByUserIdAndMid")
	public Result<?> updateFlowModelByUserIdAndMid(FlowModel flowModel) {
		payService.updateFlowModelByUserIdAndMid(flowModel);
		return Result.success();
	}

	/**
	 * 查询购买记录
	 * 
	 * @param orderFlow
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/getLoadBuy")
	@ResponseBody
	public Result<?> getLoadBuy(OrderFlow orderFlow, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<OrderFlow> list = payService.getLoadBuy(orderFlow);
		PageInfo<OrderFlow> pageInfo = new PageInfo<OrderFlow>(list);
		return Result.success(pageInfo);
	}

}