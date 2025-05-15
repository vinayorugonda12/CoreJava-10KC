package com.oops;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.initializeValues("vinay", 20000, 21, "developer");
//		emp.display();
		System.out.println(emp.salary());
		

	}

}
