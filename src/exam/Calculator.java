package exam;
import java.util.Scanner;

public class Calculator {
	
	static  void calculate(int a,int b,char op) {
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default :
			System.out.println("invalid");
		
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1=sc.nextInt();
		System.out.println("enter num2: ");

		int num2=sc.nextInt();
		System.out.println("enter operation: ");

		char ch=sc.next().charAt(0);
		
		calculate(num1, num2, ch);
		
		
		sc.close();
		

	}

}
