package com.arrays;

public class OddNumbers {
	
	static void oddNumbers(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
			
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		oddNumbers(arr);
		
	}

}
