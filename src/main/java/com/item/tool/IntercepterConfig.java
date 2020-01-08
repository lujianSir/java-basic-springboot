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
public class IntercepterConfig implements WebMvcConfigurer{

	
	@Value("${disk-path}")
	private String rootPath;
	
	private TokenInterceptor tokenInterceptor;

    //构造方法
    public IntercepterConfig(TokenInterceptor tokenInterceptor){
        this.tokenInterceptor = tokenInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
		
		  List<String> excludePath = new ArrayList<>();
//		  excludePath.add("/file/queryModels"); //商城页面
		  excludePath.add("/file/queryModelById"); //商城详情
		  excludePath.add("/file/upload"); //商城详情
		  excludePath.add("/assets/**"); //静态资源
		  excludePath.add("/user/**"); //用户登录、注册
		  excludePath.add("/static/**"); //静态资源
		  excludePath.add("/tag/**"); //帮助文档接口
		  excludePath.add("/image/web/模型封面/**"); //静态资源
		  registry.addInterceptor(tokenInterceptor) .addPathPatterns("/**")
		  .excludePathPatterns(excludePath);
		  WebMvcConfigurer.super.addInterceptors(registry);
		 
    }
}
