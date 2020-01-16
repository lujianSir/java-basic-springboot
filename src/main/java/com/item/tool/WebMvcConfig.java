package com.item.tool;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 图片绝对地址与虚拟地址映射
 */
 
@Component
public class WebMvcConfig implements WebMvcConfigurer{
	
	/**
     * 虚拟路径配置
     * @param registry
     */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/image/模型描述/**").addResourceLocations("file:/D:/upload/模型描述/");
		registry.addResourceHandler("/image/web/模型封面/**").addResourceLocations("file:/D:/upload/web/模型封面/");
		//registry.addResourceHandler("/image/模型描述/**").addResourceLocations("file:/usr/local/jar/D:/upload/模型描述/");//linux
		//registry.addResourceHandler("/image/web/模型封面/**").addResourceLocations("file:/usr/local/jar/D:/upload/web/模型封面/");//linux
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

}
