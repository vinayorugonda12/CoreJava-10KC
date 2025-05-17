package com.ps;

public class TwinPrimesInRange {

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	static void twinPrimes(int range) {
		for (int i = 1; i <= range; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.print("(" + i + "," + (i + 2) + ")" + " ");
			}
		}
	}

	public static void main(String[] args) {
		twinPrimes(50);

	}

}
