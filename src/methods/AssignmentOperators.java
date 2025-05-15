package methods;

public class AssignmentOperators {

	// +=, -=, *=, /=, and %=
	
	static void PlusEqualTo(){
		int a=10;
		int b=10;
		int c;
		c=a+=b;
		System.out.println("a plus equal to b is :"+ c );
		
	}
	
	static void MinusEqualTo(){
		int a=10;
		int b=10;
		int c;
		c=a-=b;
		System.out.println("a minus equal to b is :"+ c );
		
	}
	static void MultEqualTo(){
		int a=10;
		int b=10;
		int c;
		c=a*=b;
		System.out.println("a mult equal to b is :"+ c );
		
	}
	static void divideEqualTo(){
		int a=10;
		int b=10;
		int c;
		c=a/=b;
		System.out.println("a divide equal to b is :"+ c );
		
	}
	static void ModuloEqualTo(){
		int a=10;
		int b=10;
		int c;
		c=a%=b;
		System.out.println("a modulo equal to b is :"+ c );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusEqualTo();
		MinusEqualTo();
		MultEqualTo();
		divideEqualTo();
		ModuloEqualTo();

	}

}
