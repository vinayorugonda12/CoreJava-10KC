package com.problemsolving;

public class Swapping {
	
	static void swappingWithTemp(int a,int b) {
		
		System.out.println("swapping with temp variable:");
		
		System.out.println("before swap:");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		//swapping logic
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swap:");
		System.out.println("a :"+a);
		System.out.println("b :"+b);	
	}
	
	
	
	
	static void swappingWithoutTemp(int a,int b) {
		
		System.out.println("swapping without temp variable:");
		
		System.out.println("before swap:");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		//swapping logic
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap:");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
	}
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=40;
		swappingWithTemp(num1,num2);
		
		System.out.println("-----------------------");
		swappingWithoutTemp(num1, num2);

	}

}
