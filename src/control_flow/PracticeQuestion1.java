/*  0-100  valid
 * 0-35    fail
 * 36-50   good
 * 51-75   best
 * 76-100  excellent
 */

package control_flow;

public class PracticeQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number=200;
		if(number>=0 && number<=100) {
			
			if(number<=35) {
				System.out.println("fail");
			}
			else if(number<=50) {
				System.out.println("good");
				
			}
			else if(number<=75) {
				System.out.println("best");
				
			}
			else {
				System.out.println("Execllent");
				
			}
			
		}
		
		
		else {
			System.out.println("invalid Input");
			
		}

	}

}
