package com.arrays;

import java.util.Arrays;


//count the prime numbers in a given array

//write a program to create a new array from the given array

//a={4,9,16,25,36}  =>[perfect square numbers]

//input :[4,8,16,24,13,9,7,3,13]
//output:["even","even","even",....]






public class PrimeNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6 };
		int pcount = 0;

		// for checking count

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				pcount++;
			}

		}

		int[] prime = new int[pcount];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {

				// doubling each element and assigning to new array
				prime[j] = arr[i] * 2;
				j++;
			}

		}
		System.out.println(Arrays.toString(prime));

	}

	// prime number logic

	private static boolean isPrime(int a) {

		// less than 2 and negative numbers

		if (a < 2) {
			return false;
		}

		boolean result = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				result = false;
			}

		}

		return result;
	}

}
