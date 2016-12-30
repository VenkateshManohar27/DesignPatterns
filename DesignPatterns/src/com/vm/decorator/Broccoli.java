package com.vm.decorator;

public class Broccoli extends PizzaDecorator {
	private final Pizza pizza;
	
	public Broccoli(Pizza pizza) {
		super();
		this.pizza=pizza;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+10.0;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc()+", Brocolli (10.0)";
	}

}
