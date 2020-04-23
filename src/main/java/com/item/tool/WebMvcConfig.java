package com.item.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 图片绝对地址与虚拟地址映射
 */

@Component
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private LoginInterceptor loginInterceptor;

	/**
	 * 虚拟路径配置
	 * 
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String newrootPath = System.getProperty("user.dir") + "/upload";
		newrootPath = newrootPath.replaceAll("\\\\", "/");
		// System.out.println("file:/" + newrootPath + "/模型描述/");
		// registry.addResourceHandler("/image/模型描述/**").addResourceLocations("file:/" +
		// newrootPath + "/模型描述/");
		// registry.addResourceHandler("/image/web/模型封面/**").addResourceLocations("file:/"
		// + newrootPath + "/web/模型封面/");
		// registry.addResourceHandler("/image/web/模型源文件/**").addResourceLocations("file:/"
		// + newrootPath + "/web/模型源文件/");
		registry.addResourceHandler("/image/web/模型封面/**")
				.addResourceLocations("file:/mnt/javaweb/shop/upload/web/模型封面/");// linux
		registry.addResourceHandler("/image/web/模型源文件/**")
				.addResourceLocations("file:/mnt/javaweb/shop/upload/web/模型源文件/");// linux
		registry.addResourceHandler("/image/模型描述/**").addResourceLocations("file:/mnt/javaweb/shop/upload/模型描述/");//
		// linux
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns("/**") 表示拦截所有的请求，
		// excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
		registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register");

	}

}
