package com.item.config;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.item.tool.TokenUtil;

/**
 * 拦截器
 * 
 * @author Administrator
 *
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 配置跨域访问的最简单的方式是用通配符 * ，（就是不安全，所有的请求都能跨域）
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,HEAD,PUT,PATCH");
//        response.setHeader("Access-Control-Max-Age", "36000");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,Authorization,authorization");
//        response.setHeader("Access-Control-Allow-Credentials","true");//保持跨域 Ajax 时的 Cookie

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");

		String token = request.getHeader("token");
		if (token != null) {
			boolean result = TokenUtil.verify(token);
			if (result) {
				System.out.println("通过拦截器");
				return true;
			}
		}

//		HttpSession session = request.getSession();
//		User user = (User) session.getAttribute("user");
//		// 如果session中没有user，表示没登陆
//		if (user != null) {
//			return true; // 如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
//		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		try {
			JSONObject json = new JSONObject();
			json.put("success", "false");
			json.put("msg", "登录时间已过，请重新登录");
			json.put("code", "401");
			response.getWriter().append(json.toString());
			System.out.println("认证失败，未通过拦截器");
			// response.getWriter().write("50000");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendError(500);
			return false;
		}

		return false;

	}
}
