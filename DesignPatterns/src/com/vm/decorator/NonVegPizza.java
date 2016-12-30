package com.vm.decorator;

public class NonVegPizza implements Pizza {

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "Non Veg Pizza (50.0)";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50.0;
	}

}
