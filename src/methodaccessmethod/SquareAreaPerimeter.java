package methodaccessmethod;

public class SquareAreaPerimeter {
	double side;
	
	
	public void initialize(double a) {
		side=a;
		
	}
	
	
	public double area() {
		return side*side;
		
	}
	
	public double perimeter() {
		
		return 4*side;
		
	}
	public void print() {
		System.out.println("area of square is:"+area());
		System.out.println("perimeter of square is:"+perimeter());
	}
	
	

	public static void main(String[] args) {
		SquareAreaPerimeter s1=new SquareAreaPerimeter();
		s1.initialize(10);
		System.out.println("area of square is:"+s1.area());
		System.out.println("perimeter of square is:"+s1.perimeter());
		
		
		

	}

}
