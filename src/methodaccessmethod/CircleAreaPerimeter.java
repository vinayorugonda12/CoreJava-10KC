package methodaccessmethod;

public class CircleAreaPerimeter {
	
	double radius;
	
	
	public void initialization(double r) {
		radius=r;
	}
	
	public double area() {
		return  (double)22/7*radius*radius;
		
	}
	
	
	public double perimeter() {
		return 2*(double)22/7*radius;
		
	}
	
	public void print() {
		System.out.println("area of the circle is:"+area());
		System.out.println("perimeter of the circle is:"+perimeter());
	}
	

	public static void main(String[] args) {
		CircleAreaPerimeter c1=new CircleAreaPerimeter();
		c1.initialization(11);
		c1.print();
		
		
		// TODO Auto-generated method stub

	}

}
