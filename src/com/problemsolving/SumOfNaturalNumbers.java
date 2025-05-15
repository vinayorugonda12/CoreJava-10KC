package com.problemsolving;
import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	static void sum(int num){
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int range=sc.nextInt();
		sum(range);
		sc.close();
	}

}
