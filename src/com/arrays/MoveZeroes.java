package com.arrays;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr = { 10, 0, 20, 0, 0, 23 };
		moveZeroes(arr);
	}

	static void moveZeroes(int[] arr) {
		 int index=0;
		 
		 //inserting non-zeroes
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=0) {
				 arr[index]=arr[i];
				 index++;
			 }
		 }
		 
		 //inserting zeroes
		 
		 for(int i=index;i<arr.length;i++) {
			 arr[i]=0;
		 }
		 
		 
		 
		 System.out.println(Arrays.toString(arr));
	}

}
