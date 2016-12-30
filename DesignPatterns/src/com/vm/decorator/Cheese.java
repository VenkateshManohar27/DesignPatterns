package com.vm.decorator;

public class Cheese extends PizzaDecorator {
	private final Pizza pizza;
	public Cheese(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+9.75;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+", Cheese (9.75)";
	}
	
}
