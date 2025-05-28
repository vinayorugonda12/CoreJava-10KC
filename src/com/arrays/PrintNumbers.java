package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		System.out.println("enter size :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
//			System.out.println("enter va");
			arr[i] = sc.nextInt();

		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(Arrays.toString(arr));
//
//		}
		System.out.print(Arrays.toString(arr));
		sc.close();

	}

}
