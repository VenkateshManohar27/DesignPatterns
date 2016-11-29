package com.vm.bridge.pattern;

public abstract class Car {
	protected final Product product;
	protected final String carType;

	public Car(String carType, Product product) {
		this.carType = carType;
		this.product = product;
	}

	public abstract void assemble();

	public abstract void produceProduct();

	public void printDetails() {
		System.out.println("Car: " + carType + ", Product:" + product.productName());
	}

}
