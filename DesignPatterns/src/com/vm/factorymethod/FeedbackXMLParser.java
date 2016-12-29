package com.vm.factorymethod;

public class FeedbackXMLParser implements XMLParser {

	public FeedbackXMLParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parse() {

		System.out.println("Parse method of FeedbackXML parser");
		return "Feedback XML being parsed";
	}

}
