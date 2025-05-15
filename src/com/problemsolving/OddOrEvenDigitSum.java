package com.problemsolving;

//finding odd digits and even digits and their sum
//then compare there sum and print table of it.

public class OddOrEvenDigitSum {

	int evenSum = 0;
	int oddSum = 0;

	public void digitSum(int n) {
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				evenSum += rem;
			} else {
				oddSum += rem;
			}
			n = n / 10;
		}

		if (evenSum > oddSum) {
			table(evenSum);

		} else {
			table(oddSum);
		}

	}

	public void table(int t) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(t + " * " + i + " = " + t * i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddOrEvenDigitSum obj = new OddOrEvenDigitSum();
		obj.digitSum(12345);

	}

}
