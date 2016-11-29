package com.vm.bridge.pattern;

public class GearLocking implements Product {
	private String productName;
	
	public GearLocking(String productName) {
		// TODO Auto-generated constructor stub
		this.productName = productName;
	}

	@Override
	public String productName() {
		// TODO Auto-generated method stub
		return this.productName;
	}

	@Override
	public void produce() {
		System.out.println("producing gear locking system");

	}

}
