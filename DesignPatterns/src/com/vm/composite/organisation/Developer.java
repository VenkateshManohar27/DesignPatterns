package com.vm.composite.organisation;

public class Developer implements Employee {
	private String empId;
	private String name;
	private String designation;
	private double salary;

	public Developer(String empId, String name, String designation, double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String getEmpId() {
		return this.empId;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDesignation() {
		return this.designation;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public double organizationCost() {
		// TODO Auto-generated method stub
		return getSalary();
	}

	@Override
	public void print() {
		System.out.println("==============================================");
		System.out.println("Employee ID: " + empId);
		System.out.println("Name :" + name);
		System.out.println("Designation :" + designation);
		System.out.println("Salary :" + salary);
		System.out.println("==============================================");

	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		//No implementation for leaf
	}

	@Override
	public void removeEmployee(Employee e) {
		// TODO Auto-generated method stub
		//Leaf does not contain any children
		
	}

}
