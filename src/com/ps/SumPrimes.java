package com.ps;

public class SumPrimes {

	public void digitSumPrimes(int r) {
		for (int i = 2; i <= r; i++) {
			int num = i;
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + rem;
				num /= 10;
			}
			if (isPrime(sum)) {
				System.out.print(i+" ");
			}

		}

	}

	public boolean isPrime(int sum) {
		for (int j = 2; j < sum; j++) {
			if (sum % j == 0) {
				return false;

			}
		}
		return true;

	}

	public static void main(String[] args) {
		SumPrimes s = new SumPrimes();
		s.digitSumPrimes(50);

	}

}
