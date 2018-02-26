package com.spider.gather.service;

import java.io.IOException;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * 消息的生产者
 * 
 * @author 豆芽菜橙
 *
 */
@Service
public class MsgProducer {

	private static Logger logger = LoggerFactory.getLogger(MsgProducer.class);

	@Resource(name = "amqpTemplate") 
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Object message) throws IOException {
		logger.info("send message is:{}", message);
		amqpTemplate.convertAndSend("spider_queue_master_key", message);
//		amqpTemplate.convertAndSend("spider_queue_slave_key", message);
	}
	
}
