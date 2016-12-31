package com.vm.flyweight;

public class TestFlyweightPattern {

	public TestFlyweightPattern() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Code code = new Code();
		code.setCode("C Code...");
		Platform platform = PlatformFactory.getPlatform("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("CPP Code...");
		platform = PlatformFactory.getPlatform("CPP");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code...");
		platform = PlatformFactory.getPlatform("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("C Code2...");
		platform = PlatformFactory.getPlatform("C");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("CPP Code2...");
		platform = PlatformFactory.getPlatform("CPP");
		platform.execute(code);
		System.out.println("-------------------------------------");
		code = new Code();
		code.setCode("JAVA Code2...");
		platform = PlatformFactory.getPlatform("JAVA");
		platform.execute(code);
		System.out.println("-------------------------------------");
	}
}
