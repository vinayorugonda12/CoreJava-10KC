package com.oops;

public class ConstructerChaining {

	public ConstructerChaining() {
		System.out.println("empty parameter");

	}

	public ConstructerChaining(int a) {
		this(2.1);
		System.out.println("Int parameter");

	}

	public ConstructerChaining(double a) {
		this();
		
		System.out.println("double parameter");

	}

	public static void main(String[] args) {
		new ConstructerChaining(21);

	}

}
