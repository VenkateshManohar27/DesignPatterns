package com.vm.composite.organisation;

public class CompositePatternTest {

	public CompositePatternTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Employee emp1=new Developer("1","John", "Software Engineer", 10000);
		  Employee emp2=new Developer("2","David", "Software Engineer", 15000);
		  Employee manager1=new Manager("3","Daniel", "Engineering Manager",25000);
		  manager1.addEmployee(emp1);
		  manager1.addEmployee(emp2);
		  Employee emp3=new Developer("4","Michael", "Software Engineer", 20000);
		  Manager generalManager=new Manager("3","Mark", "General Manager", 50000);
		  generalManager.addEmployee(emp3);
		  generalManager.addEmployee(manager1);
		  generalManager.print();
		  System.out.println("Organization Cost :"+generalManager.organizationCost());
		  manager1.removeEmployee(emp1);
		  System.out.println("Organization Cost :"+generalManager.organizationCost());
	}
}
