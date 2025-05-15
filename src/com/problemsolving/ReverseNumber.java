package com.problemsolving;

public class ReverseNumber {
	
	
	static void reverse1() { 
		int number=1234;
		while(number>0) {
			int rem=number%10;
			System.out.print(rem);
			number=number/10;
			
			
		}
	}
	
	
	
//	static void reverse2() {
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse1();
	
		
		

	}





	

}
