package com.vm.designpatterns;

public class EagerInitializedSingleton {
	private static EagerInitializedSingleton singleton = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){
		
	}
	
	public static EagerInitializedSingleton getInstance(){
		return singleton;
	}
}
