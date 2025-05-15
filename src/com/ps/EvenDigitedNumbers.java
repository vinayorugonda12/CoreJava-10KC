package com.ps;

import java.util.Scanner;

public class EvenDigitedNumbers {

	public void evenDigitedNumbers(int s, int e) {
		for (int i = s; i <= e; i++) {
			int num = i;
			int cnt = 0;

			while (num > 0) {
				int rem = i % 10;
				if (rem % 2 == 0) {
					cnt++;
					num /= 10;
				} else {
					num /= 10;
				}

			}

			if (cnt > 0) {
				System.out.println(i + " ");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range:");
		int start = sc.nextInt();
		int end = sc.nextInt();
		EvenDigitedNumbers e = new EvenDigitedNumbers();
		e.evenDigitedNumbers(start, end);
		sc.close();
	}

}
