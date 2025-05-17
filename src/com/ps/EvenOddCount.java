package com.ps;

public class EvenOddCount {

	static void evenOddDigitCount(int n) {
		int evenCount = 0;
		int oddCount = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
			n = n / 10;
		}
		System.out.println("even digits count: " + evenCount);
		System.out.println("odd digits count: " + oddCount);

	}

	public static void main(String[] args) {
		evenOddDigitCount(123456);

	}

}
