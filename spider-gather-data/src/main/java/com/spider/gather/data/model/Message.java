package com.spider.gather.data.model;

import java.io.Serializable;

/**
 * MQ 消息 ---对接RabbitMq的Message
 * 
 * @author 豆芽菜橙
 *
 */
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Long id;

	/**
	 * 爬取目标名字
	 */
	private String targetName;

	/**
	 * 目标url
	 */
	private String targetUrl;

	/**
	 * 爬取页数
	 */
	private Integer pageNum;

	/**
	 * 模板名字，service名字
	 */
	private String templateServiceName;

	/**
	 * 模板方法，对应service方法
	 */
	private String templateServiceMethod;

	/**
	 * 请求参数
	 */
	private String requestParam;

	/**
	 * 优先级
	 */
	private String priority;

	/**
	 * 当前批次，也就是版本号
	 */
	private int spiderOrderBatch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getTemplateServiceName() {
		return templateServiceName;
	}

	public void setTemplateServiceName(String templateServiceName) {
		this.templateServiceName = templateServiceName;
	}

	public String getTemplateServiceMethod() {
		return templateServiceMethod;
	}

	public void setTemplateServiceMethod(String templateServiceMethod) {
		this.templateServiceMethod = templateServiceMethod;
	}

	public String getRequestParam() {
		return requestParam;
	}

	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getSpiderOrderBatch() {
		return spiderOrderBatch;
	}

	public void setSpiderOrderBatch(int spiderOrderBatch) {
		this.spiderOrderBatch = spiderOrderBatch;
	}

}
