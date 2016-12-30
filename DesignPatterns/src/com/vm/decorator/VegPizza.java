package com.vm.decorator;

public class VegPizza implements Pizza {

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "Veg Pizza (35.0)";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 35.0;
	}

}
