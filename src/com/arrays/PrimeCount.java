package com.arrays;

public class PrimeCount {

	private static boolean isPrime(int a) {

		// less than 2 and negative numbers

		if (a < 2) {
			return false;
		}

		boolean result = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				result = false;
			}

		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}

		}

		System.out.println("primes count is : " + count);

	}

}
