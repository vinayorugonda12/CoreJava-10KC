
/*A or a -> may get 76-100
 * B or b  ->  may get 51-75
 * C or c ->may get 36-50
 * F or f  ->may get 0-35
 * */

package control_flow;
public class PracticeQuestion3 {

	public static void main(String[] args) {

		char ch = 'a';
		if (ch == 'A'|| ch=='a' || ch == 'B' || ch=='b' || ch == 'C'||ch=='c' || ch == 'F' || ch=='f') {

			if (ch == 'A' || ch=='a') {
				System.out.println("may get 76-100");
			} else if (ch == 'B' || ch=='b') {
				System.out.println("may get 51-75");
			} else if (ch == 'C' || ch=='c') {
				System.out.println("may get 36-50");
			} else {
				System.out.println("may get 0-35");
			}

		}

		else {
			System.out.println("Out of range");

		}

	}

}
