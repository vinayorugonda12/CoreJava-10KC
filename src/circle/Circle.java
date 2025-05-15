package circle;


// BLC  business logic class

public class Circle {
	
	
	static double PI=3.14;
	double radius;
	
	public void initialization(double r) {
		radius=r;
		
		
	}
	
	public double diameter() {
		return 2*radius;
	}
	
	public double area() {
		return PI*radius*radius;
		
	}
	public double circumference() {
		return 2*PI*radius;
	}
	
	public String display() { 
		return "radius :"+radius+"cm" +"\n"+"diameter :"+diameter()+"cm"+"\n" +"area :"+area()+"sq.cm"+"\n"+"circumference :"+circumference()+"cm";
	}
	

}
