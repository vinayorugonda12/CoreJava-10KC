package com.searchingsorting;

public class LinearSearch {

	public static void main(String[] args) {

		
		int[] arr= {1,2,3,43,2,34,2,3,4};
		int target=4;
		boolean result=false;
		for (int i = 0; i < arr.length; i++) {
			if(target==arr[i]) {
				result=true;
				break;
			}
			
		}
		
		if(result) {
			System.out.println("found");

		}
		else {
			System.out.println(" not found");

		}

	}

}
