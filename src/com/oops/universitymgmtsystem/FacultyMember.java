package com.oops.universitymgmtsystem;

public class FacultyMember extends Employee {
	
	private int departmentCode;
	private int yearsOfService;

	public FacultyMember(String employeeId, String name, int departmentCode, int yearsOfService) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsOfService = yearsOfService;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	
	@Override
	public double calculateSalary() {
		
		return 50000+(1000*yearsOfService);
	}

	@Override
	 public void displayDetails() {
		System.out.println("Employee Details:");
		printBasicInfo();
		
		System.out.println("Department code: "+departmentCode);
		System.out.println("yearsOfService: "+yearsOfService);
		System.out.println("Monthly salary: "+calculateSalary());
		
		System.out.println();

	}


}
