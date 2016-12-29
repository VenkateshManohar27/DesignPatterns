package com.vm.prototype;

public class AccessControl implements Prototype {
	private final String controlLevel;
	private String access;
	
	public AccessControl(String controlLevel, String access) {
		super();
		this.access = access;
		this.controlLevel = controlLevel;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccessControl [controlLevel=");
		builder.append(controlLevel);
		builder.append(", access=");
		builder.append(access);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public AccessControl clone() throws CloneNotSupportedException {
		try{
			return (AccessControl) super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		
		
		return null;
	}


	public String getAccess() {
		return access;
	}


	public void setAccess(String access) {
		this.access = access;
	}


	public String getControlLevel() {
		return controlLevel;
	}


	

	
}
