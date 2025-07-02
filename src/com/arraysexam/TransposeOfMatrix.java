package com.arraysexam;

import java.util.Arrays;

public class TransposeOfMatrix {

	static void transpose(int[][] arr, int m, int n) {
//		int[][] tMatrix = new int[n][m];
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				tMatrix[j][i] = arr[i][j];
//
//			}
//
//		}
//
//		for (int i = 0; i < tMatrix.length; i++) {
//
//			System.out.println(Arrays.toString(tMatrix[i]));
//		}
//	}
//
//	public static void main(String[] args) {
//		int[][] arr = {
//						{ 1, 2, 3 },
//						
//				        { 4, 5, 6 } };
//
//		int m = arr.length;
//		int n = arr[0].length;
//		transpose(arr, m, n);
//	}
	
		
	}
	public static void main(String[] args) {
		int[] arr5 = {3,5,6,4,5};
		int[] arr2 = arr5;
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr2));
	}
}
