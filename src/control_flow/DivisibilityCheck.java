package control_flow;

public class DivisibilityCheck {
	
	static void divisibilityCheck(int a) {
		
		if(a%5==0) {
			if(a%11==0) {
				System.out.println("The number is divisible by both 5 and 11");
			}
			else {
				System.out.println("The number is divisible by only 5 ");
			}
		}
		
		else {
			if(a%11==0) {
				System.out.println("The number is divisible by only 11 ");
			}
			else {
				System.out.println("The number is  not divisible by both 5 and 11");
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		
		int number=55;
		divisibilityCheck(number);

	}

}
