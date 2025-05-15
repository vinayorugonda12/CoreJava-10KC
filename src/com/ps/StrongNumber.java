package com.ps;

public class StrongNumber {

	public void strongNumber(int n) {
		int original = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + factorial(rem);
			n /= 10;
		}

		if (original == sum) {
			System.out.println("Strong number");
		} else {
			System.out.println("not strong number");
		}

	}

	public int factorial(int r) {
		int fact = 1;
		for (int i = 1; i <= r; i++) {
			fact = fact * i;

		}

		return fact;
	}

	public static void main(String[] args) {
		StrongNumber sn = new StrongNumber();
		sn.strongNumber(15);
	}

}
