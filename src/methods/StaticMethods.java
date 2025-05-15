package methods;

public class StaticMethods {
	
	//addition method
	
	static void Addition() {
		System.out.println("addition starts:");
		int a=2;
		int b=3;
		int c;
		c=a+b;
		System.out.println("a addition b :"+ c);
		//System.out.println("addition ends..");
		System.out.println();
	}
	
	//subtraction method
	
	static void Subtraction() {
		System.out.println("subtraction starts:");
		int a=20;
		int b=10;
		int c;
		c=a-b;
		System.out.println("a subtraction b is:"+c);
		System.out.println();
	}
	
	//multiplication method
	
	static void multiplication() {
		System.out.println("multiplication starts:");
		int a=20;
		int b=10;
		int c;
		c=a-b;
		System.out.println("a multiplication b is:"+c);
		System.out.println();
	}
	//division method
	
	static void Division() {
		System.out.println("division starts:");
		int a=20;
		int b=10;
		int c;
		c=a/b;
		System.out.println("a division b is:"+c);
		System.out.println();
	}
	
	static void Remainder() {
		System.out.println("remainder starts:");
		int a=20;
		int b=10;
		int c;
		c=a%b;
		System.out.println("a remainder b is:"+c);
	}
	

	public static void main(String[] args) {
		Addition();
		Subtraction();
		multiplication();
		Division();
		Remainder();
	}

}
