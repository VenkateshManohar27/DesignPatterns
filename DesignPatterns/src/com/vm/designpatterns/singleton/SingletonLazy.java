package com.vm.designpatterns.singleton;

public class SingletonLazy {

	private static SingletonLazy sl;

	private SingletonLazy() {
		// TODO Auto-generated constructor stub

	}

	public static SingletonLazy getInstance() {
		if (sl == null) {
			sl = new SingletonLazy();
		}

		return sl;
	}
}
