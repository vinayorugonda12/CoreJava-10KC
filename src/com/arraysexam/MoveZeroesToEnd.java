package com.arraysexam;

import java.util.Arrays;

public class MoveZeroesToEnd {

	static void moveZeroes(int[] array) {
		int count = 0;

		// filling non zeroes

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[count] = array[i];
				count++;

			}

		}

		// filling remaining zeroes

		for (int i = count; i < array.length; i++) {
			array[i] = 0;

		}

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 0, 5, 3, 0, 4 };
		moveZeroes(arr);

	}

}
