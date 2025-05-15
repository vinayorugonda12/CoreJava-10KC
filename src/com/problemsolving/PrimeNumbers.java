package com.problemsolving;

import java.util.Scanner;

public class PrimeNumbers {

	// single prime number checking

	static void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.print(n+" ");
		}
//		 else {
//			System.out.println("not prime");
//		}

	}

	// multiple prime checking

	static void primes(int range) {

//		for (int i = range; i>=2; i--) {
//			int count=0;
//			
//			for (int j = 1; j <=i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//				
//			}
//			if(count==2) {
//				System.out.println(i);
//			}

//			else {
//				System.out.println(i +" not prime");
//			}

		for (int i = 2; i <= range; i++) {
			prime(i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
//		prime(number);
		primes(number);

		sc.close();

	}

}
