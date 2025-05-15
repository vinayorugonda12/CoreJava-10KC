package control_flow;

public class VotingEligibility {
	
	
	static void votingEligibility(int a) {
		if(a>=18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible to  Vote");
		}
		
	}

	public static void main(String[] args) {
		int age=21;
		votingEligibility(age);
	

	}

}
