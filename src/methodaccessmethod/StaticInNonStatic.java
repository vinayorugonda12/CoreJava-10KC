package methodaccessmethod;

public class StaticInNonStatic {

	// non-static method accessing static method

	public void nonStaticMethod() {
		System.out.println("non static method called");
		staticMethod();

	}

	// static method

	static void staticMethod() {
		System.out.println("static method called");

	}

	public static void main(String[] args) {

		StaticInNonStatic obj = new StaticInNonStatic();
		obj.nonStaticMethod();

	}

}
