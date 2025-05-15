package methodaccessmethod;

public class NonStaticInNonStatic {

	public void nonStaticMethod1() {

		System.out.println("Non static method 1 called");
		nonStaticMethod2();

	}

	public void nonStaticMethod2() {
		System.out.println("Non static method 2 called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticInNonStatic obj = new NonStaticInNonStatic();
		obj.nonStaticMethod1();

	}

}
