/*A -> may get 76-100
 * B  ->  may get 51-75
 * C ->may get 36-50
 * F  ->may get 0-35
 * */





package control_flow;

public class PracticeQuestion2 {

	public static void main(String[] args) {
		
		
		char ch='B';
		if(ch=='A' || ch=='B' || ch=='C' ||ch=='F') {
			
			if(ch=='A') {
				System.out.println("may get 76-100");
			}
			else if(ch=='B') {
				System.out.println("may get 51-75");
			}
			else if(ch=='C') {
				System.out.println("may get 36-50");
			}
			else {
				System.out.println("may get 0-35");
			}
			
		}
		
		else {
			System.out.println("Out of range");
			
		}
		


	}

}
