package exam;

import java.util.Scanner;

public class GradingSystem {
	
	
	static void gradingSystem(int marks) {
		if(marks>=0 && marks<=100) {
			if(marks>=90) {
				System.out.println("A");
			}
			else if(marks>=80) {
				System.out.println("B");
			}
			else if(marks>=70) {
				System.out.println("C");
			}
			else if(marks>=60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
			
		}
		else {
			System.out.println("out of range");
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks : ");
		int m=sc.nextInt();
		gradingSystem(m);
		sc.close();
		
	}

}
