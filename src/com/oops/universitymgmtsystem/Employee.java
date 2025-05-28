package com.oops.universitymgmtsystem;

public abstract class Employee {
	private String employeeId;
	private String name;

	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}


	abstract double calculateSalary();

	abstract void displayDetails();

	protected void printBasicInfo() {
		System.out.println("employee id:"+ employeeId);
		System.out.println("Name :"+name);

	}

}

