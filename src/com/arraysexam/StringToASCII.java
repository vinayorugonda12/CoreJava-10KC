package com.arraysexam;

import java.util.Arrays;

public class StringToASCII {


	static void stringToASCII(String input) {
		int[] Array=new int[input.length()];
		for (int i = 0; i < Array.length; i++) {
			Array[i]=input.charAt(i);
		}
		
		System.out.println(Arrays.toString(Array));
	}

	public static void main(String[] args) {
		String input = "ABcd";
		stringToASCII(input);
		
		
	}
}
