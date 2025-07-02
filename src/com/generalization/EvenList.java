package com.generalization;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> even =new ArrayList<Integer>();
		ArrayList<Integer> odd =new ArrayList<Integer>();
		
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2==0) {
				even.add(list.get(i));
			}
			else {
				odd.add(list.get(i));
			}
			
		}
		
		int[] even1=new int[even.size()];
		int[] odd1=new int[even.size()];
		
		
		for(int i=0;i<even1.length;i++) {
			even1[i]=even.get(i);
		}
		for(int i=0;i<odd1.length;i++) {
			odd1[i]=odd.get(i);
		}
		
		System.out.println("evens: "+Arrays.toString(even1));
		System.out.println("odds: "+Arrays.toString(odd1));

	}

}
