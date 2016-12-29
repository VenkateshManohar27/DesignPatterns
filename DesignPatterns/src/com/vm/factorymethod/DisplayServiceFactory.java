package com.vm.factorymethod;

public class DisplayServiceFactory {

	public DisplayServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public void factory(String type) {
		switch (type) {
		case "ERROR": 
			new ErrorDisplayService().display();
			break;
		case "FEEDBACK":
			new FeedbackDisplayService().display();
			break;
		case "ORDER":
			new OrderDisplayService().display();
			break;
		default:
			System.out.println("NO TYPE MATCHED");
		}

	}

}
