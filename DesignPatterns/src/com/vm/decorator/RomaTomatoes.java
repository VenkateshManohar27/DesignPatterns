package com.vm.decorator;

public class RomaTomatoes extends PizzaDecorator {
	private final Pizza pizza;

	public RomaTomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc()+" , RomaTomatoes(12.88)";
	}



	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+ 12.88;
	}

}
