package com.vm.bridge.pattern;

public class Motoren extends Car {

	public Motoren(String carType, Product product) {
		super(carType, product);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		
		System.out.println("Assembling "+product.productName()+" for "+carType);

	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifying product "+product.productName()+" according to "+carType);
	}
}
