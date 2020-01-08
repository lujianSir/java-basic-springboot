package com.item.tool;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 拦截器
 * @author Administrator
 *
 */
@Component
public class TokenInterceptor implements HandlerInterceptor{

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{

		/*
		 * //设置允许跨域的配置 // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
		 * response.setHeader("Access-Control-Allow-Origin", "*"); // 允许的访问方法
		 * response.setHeader(
		 * "Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS, DELETE, PATCH"); //
		 * Access-Control-Max-Age 用于 CORS 相关配置的缓存
		 * response.setHeader("Access-Control-Max-Age", "3600"); response.setHeader(
		 * "Access-Control-Allow-Headers","token,Origin, X-Requested-With, Content-Type, Accept"
		 * );
		 */

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        String token = request.getHeader("token");
        if(token != null){
            boolean result = TokenUtil.verify(token);
            if(result){
                System.out.println("通过拦截器");
                return true;
            }
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try{
            JSONObject json = new JSONObject();
            json.put("success","false");
            json.put("msg","登录时间已过，请重新登录");
            json.put("code","50000");
            response.getWriter().append(json.toString());
            System.out.println("认证失败，未通过拦截器");
            //        response.getWriter().write("50000");
        }catch (Exception e){
            e.printStackTrace();
            response.sendError(500);
            return false;
        }


        return false;

    }
}
