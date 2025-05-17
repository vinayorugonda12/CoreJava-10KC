package com.ps;

public class LargestDigit {
	
	static void largest(int n) {
		int larg=0;
		while(n>0) {
			int rem=n%10;
			if(rem>larg) {
				larg=rem;
			}
			n=n/10;			
		}
		System.out.println(larg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largest(1234567890);
	}

}
