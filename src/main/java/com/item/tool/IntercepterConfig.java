package com.item.tool;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

	@Value("${disk-path}")
	private String rootPath;

	private TokenInterceptor tokenInterceptor;

	// 构造方法
	public IntercepterConfig(TokenInterceptor tokenInterceptor) {
		this.tokenInterceptor = tokenInterceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

//		List<String> excludePath = new ArrayList<>();
//		excludePath.add("/file/queryModels"); // 商城页面
//		excludePath.add("/file/queryModelById"); // 商城详情
//		excludePath.add("/file/download"); // 下载
//		excludePath.add("/file/upload"); // 商城详情
//		excludePath.add("/order/returnUrl"); // 同步通知
//		excludePath.add("/order/notifyUrl"); // 异步通知
//		excludePath.add("/assets/**"); // 静态资源
//		excludePath.add("/user/**"); // 用户登录、注册
//		excludePath.add("/static/**"); // 静态资源
//		excludePath.add("/tag/**"); // 帮助文档接口
//		excludePath.add("/image/web/模型封面/**");
		// 静态资源
		// registry.addInterceptor(tokenInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);
		List<String> pathPattens = new ArrayList<>();// 需要拦截的接口
		pathPattens.add("/shop/**");
		pathPattens.add("/role/**");
		pathPattens.add("/power/**");
		pathPattens.add("/order/**");
		pathPattens.add("/file/**");
		pathPattens.add("/excel/**");

		List<String> excludePath = new ArrayList<>();
		excludePath.add("/file/queryModels"); // 商城页面
		excludePath.add("/file/queryModelById"); // 商城详情
		excludePath.add("/shop/selectShoppingCartCountByUid"); // 商城详情
		excludePath.add("/file/download"); // 下载操作
		excludePath.add("/file/upload"); // 上传操作
		excludePath.add("/user/login"); // 登录接口
		excludePath.add("/user/register");// 注册接口
		excludePath.add("/user/userMessageLogin");// 注册接口
		excludePath.add("/user/userMessageRegister");// 注册接口
		excludePath.add("/user/getCheckCode");// 注册接口
		excludePath.add("/excel/download");// excel下载接口
		excludePath.add("/excel/impotr");// excel上传接口
		registry.addInterceptor(tokenInterceptor).addPathPatterns(pathPattens).excludePathPatterns(excludePath);
	}
}
