package com.problemsolving;

public class CheckEvenSumOrOdd {
	
	static void evenOddSum() {
		int evenSum=0;
		int oddSum=0;
		for(int i=40;i<=60;i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
			}
			else {
				oddSum=oddSum+i;
			}
		}
		//checking even and odd sum
		if(evenSum>oddSum) {
			System.out.println("even Sum is Greater :"+evenSum);
		}
		else {
			System.out.println("Odd sum is greater: "+oddSum);
		}
		
	}

	
	
	
	public static void main(String[] args) {
		evenOddSum();


	}

}
