package com.item.alipay;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.item.config.FileUploadProperties;

/**
 * 配置文件监听器，用来加载自定义配置文件
 * 
 * @author Louis
 * @date Dec 12, 2018
 */
@Component
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		// TODO Auto-generated method stub
		AlipayProperties.loadProperties();
		FileUploadProperties.loadProperties();
	}

}
