package com.problemsolving;

import java.util.Scanner;

public class LargestDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largeDigit=0;                    //Integer.MIN_VALUE;
		System.out.println("enter a number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		while(number>0) {
			int rem=number%10;
			if(rem>largeDigit) {
				largeDigit=rem;
			}
			number/=10;
		}
		System.out.println(largeDigit);
		sc.close();

	}

}
