package com.oops;

public class Employee {
	 private String name;
	 private double salary;
	 private int age;
	 private String designation;
	 
	 public void initializeValues(String a,double sal,int b,String des) {
		 name=a;
		 salary=sal;
		 age=b;
		 designation=des;
		 
	 }
	 
	 
	
	 public void display() {
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(age);
		 System.out.println(designation);
	 }
	 
	 public double salary() {
		 return salary;
	 }
	 public int age() {
		 return age;
	 }
	 
	 public String designation() {
		 return designation;
	 }
	 
	 
	
	
	
	

	

}
