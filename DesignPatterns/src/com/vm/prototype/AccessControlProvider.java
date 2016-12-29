package com.vm.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {
	private static Map<String, AccessControl> acp = new HashMap<String, AccessControl>();
	static {
		acp.put("USER", new AccessControl("USER", "Can view pages and perform form related action"));
		acp.put("MANAGER", new AccessControl("MANAGER", "Can view customer details and geenerate statistics"));
		acp.put("ADMIN", new AccessControl("ADMIN", "Can give access to Managers and users. Can add new pages etc.."));
	}

	public static AccessControl getAccessControl(String type){
		AccessControl ac = acp.get(type);
		if(ac != null){
			try {
				return ac.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		return null;
	}

}
