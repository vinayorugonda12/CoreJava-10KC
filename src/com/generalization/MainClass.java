package com.generalization;

 abstract class Square{
	 double side;
	 
	
	 
	abstract void side();
	abstract void area();
	abstract void perimeter();
	
	
	
}
 
class SquareClass extends Square{

	@Override
	public void side() {
		System.out.println("side");
	}

	@Override
	public void area() {
		System.out.println("area");
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter");
	}
	
}










public class MainClass {

	public static void main(String[] args) {
		
	}
}
