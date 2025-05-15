package control_flow;

public class IfElse {
	public static void divisibleBy(int a) {

		if (a % 3 == 0) {

			if (a % 5 == 0) {
				System.out.println("the number is divisible by 3 and 5");
			} else {
				System.out.println("the number is divisible by  only 3 ");
			}
		}
		
		

		else {
			
			if(a%5==0) {
				System.out.println("the number is divisible by  only 5 ");
			}
			else {
				System.out.println("the number is  not divisible by 3 and 5");
				
			}
			
		}



	}

	public static void main(String[] args) {

		int num = 15;
		divisibleBy(num);

	}

}
