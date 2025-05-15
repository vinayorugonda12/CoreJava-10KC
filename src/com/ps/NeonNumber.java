package com.ps;

public class NeonNumber {

	public void neon(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int rem = square % 10;
			sum = sum + rem;
			square /= 10;
		}
		if (n == sum) {
			System.out.println("neon number");
		} else {
			System.out.println("not neon number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeonNumber n = new NeonNumber();
		n.neon(7);

	}

}
