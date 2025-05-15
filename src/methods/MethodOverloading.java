package methods;

public class MethodOverloading {
	
	
//	
//	void add(float a) {
//		System.out.println("method1");
//		
//		
//	}
	
	void add(Integer a) {
		System.out.println("method 1");
		
	}

	void add(Number a) {
		System.out.println("method 12");
	}
	

	void add (Float a) {		
		System.out.println("method 2");

	}
	
	void add (Double a) {		
		System.out.println("method 3");

	}
 

	public static void main(String[] args) {
	MethodOverloading m = new MethodOverloading();
	m.add(4);
	
		

	}

}
