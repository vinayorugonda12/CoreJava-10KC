package com.ps;

public class DigitAnalysis {

	// TODO Auto-generated method stub

	public void digitAnalysis(int n) {
		int num = n;
		int evenSum = 0;
		int oddSum = 0;

		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				evenSum += rem;
			} else {
				oddSum += rem;
			}
			n = n / 10;
		}

		// conditions

		if (evenSum > oddSum) {
			System.out.println("Prime number check");
	        System.out.println(isPrime(num));
		} else if (oddSum > evenSum) {
			System.out.println("Armstrong  number check");
			System.out.println(isArmstrong(num));

		} else {
			System.out.println("palindrome check");
			System.out.println(isPalindrome(num));
		}

	}
	// palindrome logic

	public boolean isPalindrome(int n) {
		int original = n;
		int reverse = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n /= 10;
		}
		if (original == reverse) {
			return true;
		} else {
			return false;
		}

	}

	// Armstrong logic

	public boolean isArmstrong(int n) {
		int oldOne = n;
		int rem;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			n /= 10;
		}
		if (oldOne == sum) {
			return true;
		} else {
			return false;
		}

	}

	// prime logic

	public boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		DigitAnalysis d = new DigitAnalysis();
		d.digitAnalysis(1234);

	}

}
