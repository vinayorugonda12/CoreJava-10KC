package com.arraysexam;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {10, 25, 30, 5, 40, 30};
		secondLargest(arr);


	}

	static void secondLargest(int[] arr) {
		int large=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>large) {
				secondLarge=large;
				large=arr[i];
			}
		}
		System.out.println("second large = "+secondLarge);
	}

}
