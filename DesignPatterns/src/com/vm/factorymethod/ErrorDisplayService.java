package com.vm.factorymethod;

public class ErrorDisplayService extends DisplayService {

	public ErrorDisplayService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public XMLParser getParser() {
		
		return new ErrorXMLParser();
	}

}
