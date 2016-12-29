package com.vm.factorymethod;

public class FeedbackDisplayService extends DisplayService {

	public FeedbackDisplayService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public XMLParser getParser() {
		// TODO Auto-generated method stub
		return new FeedbackXMLParser();
	}

}
