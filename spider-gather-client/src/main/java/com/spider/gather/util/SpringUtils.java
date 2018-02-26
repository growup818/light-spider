package com.spider.gather.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取容器bean的工具类
 * 
 * @author 豆芽菜橙
 *
 */
public class SpringUtils implements ApplicationContextAware {

	private static final Log LOG = LogFactory.getLog(SpringUtils.class);

	private static ApplicationContext applicationContext;// Spring应用上下文环境

	@Override
	public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
		// TODO Auto-generated method stub
		SpringUtils.applicationContext = applicationcontext;
	}

	/**
	 * 根据bean的name获取Spring容器里的bean
	 * @param name
	 * @return
	 */
	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}
}
