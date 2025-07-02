package exam;
// a=97
//A=65
//digit 48-0 49-1 50 51 52 53 54 55 56 57-9
import java.util.Scanner;

class CharCheck {

	public static void main(String[] args) {
		
		
				Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	
	if(ch>=65 && ch<=90) {
		System.out.println("Uppercase");
	}
	else if(ch>=97 && ch<=122) {
		System.out.println("LowerCase");
	}
	
	else if(ch>=48 && ch<=57) {
		System.out.println("Digit");
		
	}
	else {
		System.out.println("Special charcter");
	}
	
	sc.close();
	
		

	}
	
	

}
