package operators;

public class SimpleIntrest {

	public static void main(String[] args) {

		
		int Principle=100000;
		int Time=24;                  //2years=24 months
		int RateOfIntrest=2;
		
		float SimpleIntrest=(Principle*Time*RateOfIntrest)/100;
		
		System.out.println( "The calculated simple interest is:"+SimpleIntrest);

	}

}
