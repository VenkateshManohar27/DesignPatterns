package com.vm.flyweight;

public class JavaPlatform implements Platform {
	
	public JavaPlatform(){
		System.out.println("JavaPlatform object created");
	}
	
	@Override
	public void execute(Code code) {
		// TODO Auto-generated method stub
		System.out.println("Code is being executed in Java platfrom !!");
		System.out.println("Code :"+code.getCode());
	}

}
