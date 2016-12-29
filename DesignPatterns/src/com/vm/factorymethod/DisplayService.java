package com.vm.factorymethod;

public abstract class DisplayService {

	public DisplayService() {
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		XMLParser parser = getParser();
		String msg = parser.parse();
		System.out.println("Message :"+msg);
	}
	
	public abstract XMLParser getParser();
}
