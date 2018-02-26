package com.spider.gather.data.vo;

public class D implements A{

	private BB bb;
	
	public D(BB bb) {
		super();
		this.bb = bb;
	}

	@Override
	public void spiderA() {
		// TODO Auto-generated method stub
		bb.spiderB();
		System.out.println("DDDD");
	}

}
