package com.problemsolving;

public class FibinocciSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		while(true) {
			int c=a+b;
			
			if(c<=350) {
			System.out.println(c+" ");
			}
			else {
				break;
			}
			a=b;
			b=c;
		}

	}

}
