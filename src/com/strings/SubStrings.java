package com.strings;

public class SubStrings {

	public static void main(String[] args) {
		String s="babad";
//		String ss="";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <=s.length(); j++) {
				String s1=s.substring(i, j);
//				if(s1.length()==6) {
//					System.out.println(s1);
//				}
				
				System.out.println(s1);
				
				
				
			}
			
		}
	}

}
