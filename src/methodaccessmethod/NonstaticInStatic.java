package methodaccessmethod;

public class NonstaticInStatic {

	static void staticMethod() {
		System.out.println("This is static method");

	}

	public void nonStaticMethod1() {
		System.out.println("this is non static method - 1");

	}

	public void nonStaticMethod2() {
		System.out.println(" this is non-static method 2 ");

		staticMethod();
		nonStaticMethod1();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonstaticInStatic obj = new NonstaticInStatic();
		obj.nonStaticMethod2();

	}

}
