
/*3. Calculate the Area and Perimeter of a Rectangle
Write a Java program to calculate the area and perimeter of a rectangle using the following formulas:
  Perimeter=2×(length+breadth)
Area=length×breadth
 * */




package operators;

public class AreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Length=50;
		int Breadth=30;
		int Perimeter=2*(Length+Breadth);
		int Area=Length*Breadth;
		
		System.out.println("Perimeter of the rectangle is:"+ Perimeter);
		System.out.println("area of the rectangle is:" + Area);

	}

}
