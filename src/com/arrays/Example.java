package com.arrays;

import java.util.Arrays;

public class Example {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		int[] b= {1,2,3,4,5};
		
		int size=a.length+ b.length;
		
		int[] c=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			
		}
		
		int k=a.length;
		
		for(int j=0;j<b.length;j++) {
			c[k]=b[j];
			k++;
		}
		
		System.out.println(Arrays.toString(c));

		
	}

}
