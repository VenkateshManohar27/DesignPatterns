package com.vm.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {

	private static Map<String, Platform> map = new HashMap<String, Platform>();

	private PlatformFactory() {
		throw new AssertionError("Cannot instantiate the class");
	}

	public static synchronized Platform getPlatform(String type) {
		Platform platform = map.get(type);
		if (platform == null) {
			switch (type) {
			case "JAVA":
						platform = new JavaPlatform();
						map.put("JAVA", platform);
						System.out.println("Java Platform added");
						break;
						
			case "C": 	platform = new CPlatform();
						map.put("C", platform);
						System.out.println("C Platform added");
						break;
						
			case "CPP": platform = new CPPPlatform();
						map.put("CPP", platform);
						System.out.println("CPP Platform added");
						break;
						
			}
		}
		return platform;
	}
}
