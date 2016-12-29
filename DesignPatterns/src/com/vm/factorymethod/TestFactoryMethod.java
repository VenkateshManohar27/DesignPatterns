package com.vm.factorymethod;

public class TestFactoryMethod {

	public TestFactoryMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		DisplayServiceFactory factory = new DisplayServiceFactory();
		factory.factory("ERROR");
		
		factory.factory("FEEDBACK");
		
		factory.factory("ORDER");
		
		factory.factory("");
	}
}
