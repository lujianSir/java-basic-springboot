package com.item.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class FileUploadProperties {

	public static final String LOCATION = "localtion";

	/**
	 * 保存加载配置参数
	 */
	private static Map<String, String> propertiesMap = new HashMap<String, String>();

	/**
	 * 加载属性
	 */
	public static void loadProperties() {
		// 获得PathMatchingResourcePatternResolver对象
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
			// 加载resource文件(也可以加载resources)
			Resource resources = resolver.getResource("classpath:fileupload.properties");
			PropertiesFactoryBean config = new PropertiesFactoryBean();
			config.setLocation(resources);
			config.afterPropertiesSet();
			Properties prop = config.getObject();
			// 循环遍历所有得键值对并且存入集合
			for (String key : prop.stringPropertyNames()) {
				propertiesMap.put(key, (String) prop.get(key));
			}
		} catch (Exception e) {
			new Exception("配置文件加载失败");
		}
	}

	/**
	 * 获取配置参数值
	 * 
	 * @param key
	 * @return
	 */
	public static String getKey(String key) {
		return propertiesMap.get(key);
	}

	public static String getLocation() {
		return propertiesMap.get(LOCATION);
	}
}
