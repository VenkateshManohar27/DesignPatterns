package com.vm.bridge.pattern;

public class BigWheel extends Car {

	public BigWheel(String carType, Product product) {
		super(carType, product);
		
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
