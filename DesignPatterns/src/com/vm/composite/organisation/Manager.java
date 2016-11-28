package com.vm.composite.organisation;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String empId;
	private String name;
	private String designation;
	private double salary;
	private List<Employee> employeeUnderManager = new ArrayList<Employee>();

	public Manager(String empId, String name, String designation, double salary) {
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
		double cost = getSalary();
		for (Employee emp : employeeUnderManager) {
			cost += emp.organizationCost();
		}

		return cost;
	}

	@Override
	public void print() {
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Employee ID: " + empId);
		System.out.println("Name :" + name);
		System.out.println("Designation :" + designation);
		System.out.println("Salary :" + salary);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Employees under Manager");
		for (Employee emp : employeeUnderManager) {
			emp.print();
		}
	}

	
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		this.employeeUnderManager.add(e);
	}

	@Override
	public void removeEmployee(Employee e) {
		// TODO Auto-generated method stub
		this.employeeUnderManager.remove(e);
		
	}
}
