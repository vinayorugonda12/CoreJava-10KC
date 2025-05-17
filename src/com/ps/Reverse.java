package com.ps;

public class Reverse {
	static void reverse(int n) {
		int prod = 0;
		while (n > 0) {
			int rem = n % 10;
			prod = (prod * 10) + rem;
			n = n / 10;

		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		reverse(12345);

	}

}
