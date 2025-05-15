package com.problemsolving;

public class StrongNumber {

	void strongNumber(int a) {
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + factorial(rem);
			a = a / 10;
			
		}
		

		if (a==sum) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not strong number");
		}
		System.out.println(sum);

	}

	int factorial(int rem) {
		int prod = 1;
		for (int i = 1; i <= rem; i++) {
			prod = prod * i;
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrongNumber sn = new StrongNumber();
		sn.strongNumber(145);

	}

}
