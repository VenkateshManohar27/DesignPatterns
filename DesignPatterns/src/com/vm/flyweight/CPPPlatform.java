package com.vm.flyweight;

public class CPPPlatform implements Platform {

	public CPPPlatform() {
		System.out.println("CPPPlatform object created");
	}
	

	@Override
	public void execute(Code code) {
		// TODO Auto-generated method stub
		System.out.println("Code is being executed in CPPPlatform!!");
		System.out.println("Code :"+code.getCode());
	}

}
