package com.vm.flyweight;

public class CPlatform implements Platform {

	public CPlatform() {
		System.out.println("CPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Code is being executed in CPlatform!!");
		System.out.println("Code :"+code.getCode());

	}

}
