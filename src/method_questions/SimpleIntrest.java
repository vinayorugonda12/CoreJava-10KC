package method_questions;

public class SimpleIntrest {
	// double principal, double rate, int time

	
	static double calculateInterest(double principle,double rate,int time) {
		
		double Si=(principle*rate*time)/100;
		return Si;
		
	}

	public static void main(String[] args) {
		
		System.out.println(calculateInterest(10000, 2, 2));

	}

}
