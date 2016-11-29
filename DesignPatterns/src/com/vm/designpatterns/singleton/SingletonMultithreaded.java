package com.vm.designpatterns.singleton;

public class SingletonMultithreaded {

	private static SingletonMultithreaded smt = null;

	private SingletonMultithreaded() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonMultithreaded getInstance(){
		if(smt == null){
			synchronized (SingletonMultithreaded.class) {
				if(smt == null){
					smt = new SingletonMultithreaded();
				}
			}
		}
		
		return smt;
	}
}
