package com.conditionalstmts;
import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1-7 :");
		int day=sc.nextInt();
		
		switch (day) {
		
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			
			System.out.println("week day");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default :
			System.out.println("Invalid input");
			
		}
		
		
		sc.close();
	}

}
