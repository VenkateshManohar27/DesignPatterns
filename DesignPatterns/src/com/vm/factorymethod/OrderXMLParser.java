package com.vm.factorymethod;

public class OrderXMLParser implements XMLParser {

	public OrderXMLParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse() {
		System.out.println("Parse method of OrderXML parser");
		return "Order XML being parsed";
	}

}
