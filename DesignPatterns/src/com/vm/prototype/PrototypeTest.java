package com.vm.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		AccessControl userAccessControl = AccessControlProvider.getAccessControl("USER");
		User user = new User("User A", "USER", userAccessControl);
		System.out.println(user);
		userAccessControl.setAccess("he is the normal user !!");
		System.out.println(user);
		
		userAccessControl = AccessControlProvider.getAccessControl("USER");
		user = new User("User B", "USER", userAccessControl);
		System.out.println(user);
		userAccessControl.setAccess("he is a user who test the application");
		System.out.println(user);
		
		
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControl("MANAGER");
		user = new User("User C", "MANAGER Level", managerAccessControl);
		System.out.println(user);
		
	}
}
