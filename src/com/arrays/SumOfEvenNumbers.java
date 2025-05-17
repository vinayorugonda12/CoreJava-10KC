package com.arrays;

public class SumOfEvenNumbers {
	
	static void sumOfEven(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
			
			
		}
		System.out.println("sum of even :"+sum);
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		sumOfEven(arr);
		
	}

}