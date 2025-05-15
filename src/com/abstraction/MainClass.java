package com.abstraction;

public class MainClass {

	public static void main(String[] args) {
		Helper t=new Helper();
		Employee e=t.getObjectManager();
		Employee e1=t.getObjectTeamLead();
		e.expectedSalary();
		e1.expectedSalary();

	}

}
