package com.oops.universitymgmtsystem;

public class MainClass {

	public static void main(String[] args) {
		Employee faculty=new FacultyMember("21f91", "ravi", 21, 5);
		Employee staff=new StaffMember("21s91", "teja","staff" , 10);
		faculty.displayDetails();
		staff.displayDetails();
	
		
	}

}
