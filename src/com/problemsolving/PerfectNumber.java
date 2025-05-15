package com.problemsolving;

import java.util.Scanner;

public class PerfectNumber {
	
	static void perfectNumber(int num) {
		int factorSum=0;
		
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				factorSum=factorSum+i;
				
			}
			
		}
		System.out.println();
		System.out.println("sum: "+factorSum);
		if(factorSum==num) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		perfectNumber(n);
		
		sc.close();

	}

}
