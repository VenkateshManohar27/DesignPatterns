package com.vm.factorymethod;

public class OrderDisplayService extends DisplayService {

	public OrderDisplayService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public XMLParser getParser() {
		// TODO Auto-generated method stub
		return new OrderXMLParser();
	}

}
