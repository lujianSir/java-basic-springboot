package com.item.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.item.alipay.AlipayBean;
import com.item.alipay.AlipayProperties;
import com.item.service.PayService;

/**
 * 订单接口
 * 
 * @author Louis
 * @date Dec 12, 2018
 */
@RestController()
@RequestMapping("order")
public class OrderController {

    @Autowired
    private PayService payService;

    /**
     * 阿里支付
     * @param tradeNo
     * @param subject
     * @param amount
     * @param body
     * @return
     * @throws AlipayApiException
     */
    @RequestMapping(value = "alipay")
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
     * @return
     */
    @RequestMapping(value = "notifyUrl")
    public String notifyUrl(HttpServletRequest request,HttpServletResponse response) {   	
    	 Map<String, String> params = new HashMap<String, String>();  
    	//1.从支付宝回调的request域中取值
    	 Map<String, String[]> requestParams = request.getParameterMap();
    	 for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {  
    	        String name = iter.next();  
    	        String[] values = requestParams.get(name);  
    	        String valueStr = "";  
    	        for (int i = 0; i < values.length; i++) {  
    	            valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";  
    	        }  
    	        // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化  
    	        // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");  
    	        params.put(name, valueStr);  
    	    }  
    	 //2.封装必须参数
	    String out_trade_no = request.getParameter("out_trade_no");            // 商户订单号  
	    String orderType = request.getParameter("body");                    // 订单内容          
	    String tradeStatus = request.getParameter("trade_status");            //交易状态 
	    //3.签名验证(对支付宝返回的数据验证，确定是支付宝返回的)
	    boolean signVerified = false;  
	    try {  
	        //3.1调用SDK验证签名
	        signVerified = AlipaySignature.rsaCheckV1(params, AlipayProperties.getPublicKey(), AlipayProperties.getCharset(), AlipayProperties.getSignType());   
	    } catch (AlipayApiException e) {  
	        e.printStackTrace();  
	    }  
	    //4.对验签进行处理
	    if (signVerified) {    //验签通过   
//	        if(tradeStatus.equals("TRADE_SUCCESS")) {    //只处理支付成功的订单: 修改交易表状态,支付成功
//	            Trade trade = tradeService.selectByOrderNumber(out_trade_no);
//	            trade.setTradeStatus((byte)3);            //支付完成
//	            int returnResult = tradeService.updateByPrimaryKeySelective(trade);    //更新交易表中状态
//	            if(returnResult>0){
//	                 return "success";
//	            }else{
//	                 return "fail";
//	            }
//	        }else{
//	            return "fail";
//	        }
	    } else {  //验签不通过   
	        System.err.println("验签失败");
	        return "fail";
	    }
	    
    	System.out.println("----notify-----");
    	return "notifyUrl";
    }
    
    
    /**
     * 同步通知
     * @return
     */
    @RequestMapping(value = "returnUrl")
    public String returnUrl() {
    	System.out.println("----return-----");
    	return "returnUrl";
    }
    
}