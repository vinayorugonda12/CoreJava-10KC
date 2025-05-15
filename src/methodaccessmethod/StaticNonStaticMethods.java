package methodaccessmethod;

public class StaticNonStaticMethods {

	static void staticMethod1() {
		System.out.println("this is static method1");
		staticMethod2();

		// nonStaticMethod1();
		//create object reference variable and then access
		
		StaticNonStaticMethods obj1=new StaticNonStaticMethods();
		obj1.nonStaticMethod1();

	}

	
	static void staticMethod2() {
		System.out.println("this is static method2");
	}

	
	
	public void nonStaticMethod1() {
		System.out.println("this is non  static method1");

	}

	
	
	public void nonStaticMethod2() {
		System.out.println("this is non static method2");
		nonStaticMethod1();
		staticMethod2();
	}
	

	public static void main(String[] args) {
		staticMethod2();// called
		StaticNonStaticMethods obj = new StaticNonStaticMethods();
		obj.nonStaticMethod2();

	}

}
