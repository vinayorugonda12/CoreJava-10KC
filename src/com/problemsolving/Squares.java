package com.problemsolving;

import java.util.Scanner;

public class Squares {

	static void squares(int range) {

		for (int i = 1; i <= range; i++) {
			int square = i * i;
			System.out.print(square + " ");

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Range: ");
		int r = sc.nextInt();
		squares(r);
		sc.close();

	}

}
