package method_questions;

public class FahrenheitToCelsius {
	static double fahrenheitToCelsius(double fahrenheit ) {
		double celsius=(fahrenheit-32)*(double)5/9;
		return celsius;
		
		
	}

	public static void main(String[] args) {
		System.out.println( " Celsius temperature is:"+fahrenheitToCelsius(97.0));
		

	}

}
