package com.ps;

public class PalindromesInRange {

	public void palindromes(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == reversed(i)) {
				System.out.print(i + " ");
			}

		}
	}

	public int reversed(int i) {
		int rev = 0;
		while (i > 0) {
			int rem = i % 10;
			rev = rev * 10 + rem;
			i /= 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		PalindromesInRange p=new PalindromesInRange();
		p.palindromes(50);

	}

}
