package com.arrays;

public class FindTarget {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int target=8;
		// 20-05-25    primes count in an array
		
		
//		boolean result=false;
//		for (int i = 0; i < arr.length; i++) {
//			if(target==arr[i]) {
//				result=true;
//			}
//			
//		}
//		
//		if(result) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("not found");
//		}
	
		//      arr[i]<target    count elements
		
		int lessCount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<target) {
				lessCount++;
			}
			
		}
		
		System.out.println(lessCount);

		
	}

}
