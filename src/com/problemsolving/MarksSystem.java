package com.problemsolving;

public class MarksSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 80;

		if (marks >= 0 && marks <= 100) {
			if (marks >= 90) {
				System.out.println("A-Grade");
			} else if (marks > 80 && marks < 90) {
				System.out.println("B-Grade");
			} else {
				System.out.println("C-Grade");
			}

		} else {
			System.out.println("invalid input");
		}

	}

}
