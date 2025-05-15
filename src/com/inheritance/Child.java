package com.inheritance;

public class Child extends Parent {
	String name="vinnu";
	
	public void method() {
		System.out.println(super.name);
		System.out.println(name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
		

	}

}
