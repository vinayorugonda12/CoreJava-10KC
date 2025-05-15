package com.ps;

public class ArmstrongNumber {

	public void isArmstrong(int n) {
		int oldOne = n;
		int rem;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			n /= 10;
		}
		if (oldOne == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumber arm = new ArmstrongNumber();
		arm.isArmstrong(152);

	}

}
