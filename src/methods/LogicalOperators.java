package methods;

public class LogicalOperators {
	
	//AND
	
	static void LogicalAnd() {
		System.out.println("Logical AND starts:");
		boolean a=true;
		boolean b=false;
		boolean c;
		c=a&&b;
		System.out.println("a logical AND b :"+ c);
		System.out.println();
	}
	
	//OR
	

	static void LogicalOr() {
		System.out.println("Logical OR starts:");
		boolean a=true;
		boolean b=false;
		boolean c;
		c=a||b;
		System.out.println("a logical OR b :"+ c);
		System.out.println();
	}

	//NOT
	
	static void LogicalNot() {
		System.out.println("Logical NOT starts:");
		boolean a=true;
		boolean c;
		c=!a;
		System.out.println("a logical NOT b :"+ c);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		LogicalAnd();
		LogicalOr();
		LogicalNot();
		

	}
}
