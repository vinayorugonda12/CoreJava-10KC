package methods;
public class RelationalOperators {
	//== != < > >= <=
	static void DoubleEqual() {
		System.out.println("double equal starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a==b;
		System.out.println("a double equal b :"+ c);
		System.out.println();
	}
	
	static void LessThan() {
		System.out.println("less than starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a<b;
		System.out.println("a less than b :"+ c);
		System.out.println();
	}
	
	static void NotEqual() {
		System.out.println("double equal starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a!=b;
		System.out.println("a not equal b :"+ c);
		System.out.println();
	}
	
	static void GreaterThan() {
		System.out.println("greater than starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a>b;
		System.out.println("a greater than b :"+ c);
		System.out.println();
	}
	
	static void LessThanEqualTo() {
		System.out.println("LessThanEqualTo starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a<=b;
		System.out.println("a LessThanEqualTo b :"+ c);
		System.out.println();
	}
	
	static void GreaterThanEqualTo() {
		System.out.println("GreaterThanEqualTo starts:");
		int a=2;
		int b=3;
		boolean c;
		c=a>=b;
		System.out.println("a GreaterThanEqualTo b :"+ c);
		System.out.println();
	}
	

	public static void main(String[] args) {
		DoubleEqual();
		NotEqual();
		LessThan();
		GreaterThan();
		LessThanEqualTo();
		GreaterThanEqualTo();
	

	}

}
