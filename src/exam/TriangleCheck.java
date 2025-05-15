package exam;
import java.util.Scanner;


public class TriangleCheck {
	
	static void trianle(int a,int b,int c) {
		if(a==b && b==c && c==a) {
			System.out.println("EQuilateral");
		}
		else if(a==b || b==c || c==a ) {
			System.out.println("Isoscales");
		}
		else {
			System.out.println("Scalene");
		}
	}
	
	

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side1 :");
		int s1=sc.nextInt();
		System.out.println("enter side2: ");
		
		int s2=sc.nextInt();
		System.out.println("enter side3: ");
		
		int s3=sc.nextInt();
		
		trianle(s1, s2, s3);
		sc.close();
		

	}

}
