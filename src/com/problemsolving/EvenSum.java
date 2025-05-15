package com.problemsolving;
import java.util.Scanner;

public class EvenSum {
	
	static void evenSum(int num) {
		int sum=0;
		for (int i = 1; i <=num; i++) {
			if(i%2==0) {
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int range=sc.nextInt();
		evenSum(range);
		sc.close();

	}

}
