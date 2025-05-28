package com.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		
		// using sum technique 
		
//		int arrSum = 0;
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			arrSum = arrSum + arr[i];
//
//		}
//
//		System.out.println(sum - arrSum);
		
		
		//using inner for loop
		
		for (int i = 1; i < arr[arr.length-1]; i++) {

			boolean result = false;

			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					result = true;
				}

			}

			if (!result) {
				System.out.println(i);
			}

		}
		
		
		
		
		
		
	}

}
