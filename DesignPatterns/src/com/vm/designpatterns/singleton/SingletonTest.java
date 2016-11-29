package com.vm.designpatterns.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton inst1 =  EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton inst2 =  EagerInitializedSingleton.getInstance();
		
		if(inst1 == inst2){
			System.out.println("EagerInitializedSingleton: Both instances are the same!");
		}
		
		SingletonLazy inst3 =  SingletonLazy.getInstance();
		SingletonLazy inst4 =  SingletonLazy.getInstance();
		
		if(inst3 == inst4){
			System.out.println("SingletonLazy: Both instances are the same!");
		}
		
		SingletonMultithreaded inst5 =  SingletonMultithreaded.getInstance();
		SingletonMultithreaded inst6 =  SingletonMultithreaded.getInstance();
		
		if(inst5 == inst6){
			System.out.println("SingletonMultithreaded: Both instances are the same!");
		}
	}
}
