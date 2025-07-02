package com.arraysexam;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 2;
		Leftrotate(arr, d);
		Rightrotate(arr, d);

	}

	static void Rightrotate(int[] arr, int d) {
		int n = arr.length;

		for (int i = 0; i < d; i++) {
			int last = arr[n - 1];

			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];

			}
			arr[0] = last;

		}
		System.out.println("---------------");
		System.out.println(Arrays.toString(arr));

	}

	static void Leftrotate(int[] arr, int d) {
		int n = arr.length;
		for (int i = 0; i < d; i++) {
			int first = arr[0];

			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];

			}
			arr[n - 1] = first;

		}
		System.out.println(Arrays.toString(arr));
	}

}
