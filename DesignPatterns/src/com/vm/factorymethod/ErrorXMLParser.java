package com.vm.factorymethod;

import com.vm.factorymethod.XMLParser;

public class ErrorXMLParser implements XMLParser {

	public ErrorXMLParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse() {
		
		System.out.println("Parse method of ErrorXML parser");
		return "Error XML being parsed";
	}

}
