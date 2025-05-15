package com.problemsolving;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();

		while (number > 0) {
			int rem = number % 10;

			if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
				 System.out.print(rem + " ");
			}
			number = number / 10;
		}

		sc.close();

	}

}
