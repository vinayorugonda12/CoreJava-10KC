package com.ps;

public class NonFibonacciSeries {

	public void nonFibonacci(int n) {

		int a = 0;
		int b = 1;
		int c = a + b;
		for (int i = 1; i <= n; i++) {
			if (c == i) {
				// fibonacci number
				// move to next one

				a = b;
				b = c;
				c = a + b;

			} else {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonFibonacciSeries n = new NonFibonacciSeries();
		n.nonFibonacci(10);

	}

}
