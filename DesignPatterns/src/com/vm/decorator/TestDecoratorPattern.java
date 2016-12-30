package com.vm.decorator;

import java.text.DecimalFormat;

public class TestDecoratorPattern {

	public TestDecoratorPattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new VegPizza();

		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));

		pizza = new NonVegPizza();

		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));
	}
}
