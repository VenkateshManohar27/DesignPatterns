package com.vm.composite.organisation;

public interface Employee {
	public String getEmpId();
	public String getName();
	public String getDesignation();
	public void addEmployee(Employee e);
	public void removeEmployee(Employee e);
	public double getSalary();
	public double organizationCost();
	public void print();
}
