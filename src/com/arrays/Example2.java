package com.arrays;

import java.util.Arrays;

//arr=10 20 30 40 50 60 70   swap adjacent elements

public class Example2 {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i += 2) {

			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}

		System.out.println(Arrays.toString(a));

	}

}
