package com.vm.designpatterns.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton inst1 =  EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton inst2 =  EagerInitializedSingleton.getInstance();
		
		if(inst1 == inst2){
			System.out.println("Both instances are the same!");
		}
	}
}
