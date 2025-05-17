package com.arrays;

public class ArrayInitializations {
	public static void main(String[] args) {
// int[] arr=new int[10];
//		int[] arr= {1,2,3,4};
//		int[] arr =new int[] {1,2,3,4,5};
		int[] a= {1,2,3,4,5};
		a[2]=10;//modifications -> array size cant be change.
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");

		}
		
		
		

	}

}
