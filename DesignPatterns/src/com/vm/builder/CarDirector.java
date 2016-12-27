package com.vm.builder;

public class CarDirector {
	private CarBuilder carbuilder;
	
	public CarDirector(CarBuilder carBuilder) {
		// TODO Auto-generated constructor stub
		this.carbuilder= carBuilder;
	}

	public void build(){
		carbuilder.buildBodyStyle();
		carbuilder.buildBreaks();
		carbuilder.buildEngine();
		carbuilder.buildFuelType();
		carbuilder.buildPower();
		carbuilder.buildSeats();
		carbuilder.buildWindows();
	}
}
