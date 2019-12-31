package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.item.service.AlipayService;

@Controller
@RequestMapping(value = "alipay")
public class AlipayController {

	@Autowired
	private AlipayService alipayService;
	
	
	@RequestMapping("/buy")
	public String file() {
		return "/buy";
	}

	@RequestMapping(value = "webPagePay", method = RequestMethod.POST)
	@ResponseBody
	public String webPagePay(@RequestParam(value = "outTradeNo") String outTradeNo,
						 @RequestParam(value = "totalAmount") Integer totalAmount, 
						 @RequestParam(value = "subject") String subject){
		return alipayService.webPagePay(outTradeNo, totalAmount, subject);
	}
	
	
	@RequestMapping("notify_url")
	public String notifyAlipay() {
		System.out.println("----notify-----");
	    return "a li pay notify ";
	}
	
	@RequestMapping("return_url")
	public String returnAlipay() {
		System.out.println("----return-----");
	    return " a li pay return ";
	}

}
