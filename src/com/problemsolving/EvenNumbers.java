package com.problemsolving;

public class EvenNumbers {	
	
	static void reversedEven() {
		//reversed even numbers
		
				for(int i=20;i>=1;i--) {
					
						if(i%2==0) {
							System.out.println(i);
							
						}			
				}
	}
	
	static void reversedtable() {
		
		// reversed table printing
		
		int num=10;
		for (int i = 20; i >=1; i--) {
			System.out.println(num+"*"+i+"="+num*i);
		
		}


		
	}
	
	//factorial
	
	static void factorial() {
		int product=1;
		for (int i = 5; i>=1; i--) {
			product=product+i;
			System.out.print(i);
			
			
			if(i>1) {
			System.out.print(" * ");
			}
		}
		System.out.println(" = "+product);
		
	}
	
	
	
	
	static void logic() {
		for (int i = 1; i<=10; i++) {
			if(i==4 || i==5) {
//				continue;
				System.out.print("");
			}
			else {
				System.out.print(" "+i);
			}
			
		}
	}
	

	
	
	

	public static void main(String[] args) {
		
//	
//	reversedEven();
//	reversedtable();
		
//		factorial();
		logic();
	}

}
