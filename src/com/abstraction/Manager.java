package com.abstraction;

public class Manager extends Employee {

	@Override
	void hike() {
		System.out.println("hiked");

	}

	@Override
	void getSalary() {
		System.out.println("salary");
	}

	@Override
	void expectedSalary() {
		System.out.println("expexted salary");
	}

	@Override
	void noOfWorkingHours() {
		System.out.println("hours");
	}

}
