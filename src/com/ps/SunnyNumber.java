package com.ps;

public class SunnyNumber {

	public void sunnyNumber(int n) {
		if (n >= 0) {
			
			long sqrt = (long) Math.sqrt(n + 1);
			
//			System.out.println(sqrt);
			if (sqrt * sqrt == n + 1) {
				System.out.println("sunny number");
			} else {
				System.out.println("not sunny number");
			}

		} else {
			System.out.println("negative input");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunnyNumber s = new SunnyNumber();
		s.sunnyNumber(11);
	
	}

}
