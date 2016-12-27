package com.vm.builder;

import java.awt.CardLayout;

public class BuilderPatternTest {

	public BuilderPatternTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		CarBuilder sportsCar = new SportsCarBuilder();
		CarDirector director = new CarDirector(sportsCar);
		director.build();
		System.out.println(sportsCar.getCar());
		
		CarBuilder sedan =  new SedanCarBuilder();
		director = new CarDirector(sedan);
		director.build();
		System.out.println(sedan.getCar());
		
	}
}
