package com.oops.universitymgmtsystem;

public class StaffMember extends Employee {
	private String designation;
	private double overtimeHours;

	public StaffMember(String employeeId, String name, String designation, double overtimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overtimeHours = overtimeHours;
	}

	public String getDesignation() {
		return designation;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	@Override
	double calculateSalary() {
		
		return 40000+(25*overtimeHours);
	}

	@Override
	void displayDetails() {
		System.out.println("Employee details : ");
		printBasicInfo();
		  System.out.println("Designation: " + designation);
	        System.out.println("Overtime Hours: " + overtimeHours);
	        System.out.printf("Monthly Salary: "+ calculateSalary());
	        System.out.println();
	}

	

}
