package com.item.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.item.tool.AlipayConfig;

/**
 * 支付实现类
 */
@Service
public class AlipayServiceImpl implements AlipayService {

	private static final Logger LOG = LoggerFactory.getLogger(AlipayServiceImpl.class);

	/** 调取支付宝接口 web端支付 */
	DefaultAlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
			AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
			AlipayConfig.sign_type);

	@Override
	public String webPagePay(String outTradeNo, Integer totalAmount, String subject) {

		try {
			AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
			/** 同步通知，支付完成后，支付成功页面 */
			alipayRequest.setReturnUrl(AlipayConfig.return_url);
			/** 异步通知，支付完成后，需要进行的异步处理 */
			alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

			alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\"," + "\"total_amount\":\""
					+ totalAmount + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"商品名称\","
					+ "\"timeout_express\":\"90m\"," + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

			/** 转换格式 */
			String result = alipayClient.pageExecute(alipayRequest).getBody().replace('\"', '\'').replace('\n', ' ');
			return result;
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return "";
		}
		
	}

	@Override
	public boolean rsaCheckV1(HttpServletRequest request) {
		try {
			Map<String, String> params = new HashMap<>();
			Map<String, String[]> requestParams = request.getParameterMap();
			for (@SuppressWarnings("rawtypes")
			Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
				String name = (String) iter.next();
				String[] values = requestParams.get(name);
				String valueStr = "";
				for (int i = 0; i < values.length; i++) {
					valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
				}
				// 乱码解决，这段代码在出现乱码时使用
				// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
				params.put(name, valueStr);
			}
			boolean verifyResult = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
					AlipayConfig.charset, AlipayConfig.sign_type);
			return verifyResult;
		} catch (AlipayApiException e) {
			LOG.error(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean notify(String tradeStatus, String orderNo, String tradeNo) {
		if ("TRADE_FINISHED".equals(tradeStatus) || "TRADE_SUCCESS".equals(tradeStatus)) {
			// 支付成功，根据业务逻辑修改相应数据的状态
			boolean state = false;

			if (state) {
				return true;
			}
		}
		return false;
	}

}