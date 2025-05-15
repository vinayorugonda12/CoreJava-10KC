package control_flow;

public class LargestNum {
	
	static void largestNum(int a,int b) {
		if(a>b) {
			System.out.println("Largest number is :"+a);
		}
		else if(a==b) {
			System.out.println("no largest number");
		}
		else {
			System.out.println("Largest number is :"+b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=21;
		int num2=20;
		largestNum(num1, num2);

	}

}
