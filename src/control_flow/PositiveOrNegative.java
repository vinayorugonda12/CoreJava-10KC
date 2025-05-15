package control_flow;

public class PositiveOrNegative {
	
	static void positiveOrNegative( int a) {
		
		if(a<0) {
			System.out.println("it is Negative number");
		}
		else if(a==0) {
			System.out.println("the number is Zero");
			
		}
		else {
			System.out.println("the number is Positive");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		
		positiveOrNegative(num);

	}

}
