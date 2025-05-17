package com.arrays;

public class SumOfOddIndexs {
	
	static void sumOfOddIndices(int[] a) {
		int oddIndexSum=0;
		
		//odd index=i%2!=0
		//odd number=(arr[i]%2!=0)
		
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0) {
				oddIndexSum=oddIndexSum+a[i];
				
			}
			
		}
		System.out.println(oddIndexSum);
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfOddIndices(arr);
	}

}
