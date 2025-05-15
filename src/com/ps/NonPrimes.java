package com.ps;

import java.util.Scanner;

public class NonPrimes {

	public void nonPrimes(int n) {

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(i+" ");
			}
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count > 0) {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		System.out.print("enter range:");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		NonPrimes n = new NonPrimes();
		n.nonPrimes(inp);
		sc.close();
	}

}
