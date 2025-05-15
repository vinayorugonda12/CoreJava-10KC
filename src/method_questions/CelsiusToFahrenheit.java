package method_questions;

public class CelsiusToFahrenheit {
	
	static double  celsiusToFahrenheit(double celsius) {
		
		double fahrenhiet=celsius*(double)9/5+32;
		return fahrenhiet;
	}

	public static void main(String[] args) {
		System.out.println("Fahrenheit  temperature is: "+celsiusToFahrenheit(35));
	
	}

}
