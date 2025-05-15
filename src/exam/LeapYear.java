package exam;
import java.util.Scanner;

public class LeapYear {
	
	static void leapYear(int yr) {
		if((yr%4==0 && yr%100!=0) || yr%400==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not  leap Year ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter year: ");
		int year =sc.nextInt();
		leapYear(year);
		sc.close();

	}

}
