package com.strings;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		String[] s = { "flower", "flow", "flox", "float", "fl" };
		String shortest = s[0];
		String prefix = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < shortest.length()) {
				shortest = s[i];
			}
		}

//		System.out.println(shortest);

		for (int i = 0; i < shortest.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length; j++) {
				if (shortest.charAt(i) == s[i].charAt(i)) {
					count++;
				}

			}
			if (count == s.length) {
				prefix = prefix + shortest.charAt(i);
			}
			else {
//				System.out.println(-1);
				break;
				
			}

		}

		
		if(prefix.length()>0) {
			System.out.println(prefix);

		}
		else {
			System.out.println(-1);
		}
	}

}
