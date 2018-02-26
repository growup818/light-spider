package com.spider.gather.data.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消费者 类型一
 * 
 * @author 豆芽菜橙
 *
 */
public class ZJXMessageListener implements MessageListener {

	private Logger logger = LoggerFactory.getLogger(ZJXMessageListener.class);

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		logger.info("listener message ------->:{}", message);
	}

}
