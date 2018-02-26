package com.spider.gather.test;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spider.gather.service.MsgProducer;

/**
 * 测试
 * @author 豆芽菜橙
 *
 */
public class MsgTest {
	
	private Logger logger = LoggerFactory.getLogger(MsgTest.class);

	private ApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("/spring/spring-applicationContext.xml");
	}

	@Test
	public void test_send_msg() throws Exception {
		MsgProducer messageProducer = (MsgProducer) context.getBean("msgProducer");
		int a = 1;
		while (a <10 ) {
			logger.info(" spider 订单 " + a++);
			messageProducer.sendMessage(" spider 订单 " + a++);
		}
	}
}
