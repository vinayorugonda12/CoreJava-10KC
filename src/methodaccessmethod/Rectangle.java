package methodaccessmethod;

public class Rectangle {
	int length;
	int breadth;

	public void initialize(int a, int b) {
		length = a;
		breadth = b;

	}

	public double area() {
		return length * breadth;
	}

	public double perimeter() {
		return 2 * (length + breadth);
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.initialize(10, 20);

		System.out.println("area of the rectangle is:" + r1.area());
		System.out.println("perimeter of the rectangle is:" + r1.perimeter());

	}

}
