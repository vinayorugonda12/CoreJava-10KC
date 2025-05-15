package demo;

public class UsingStaticVariables {
	 static byte studentAge=21;
	                           // to use non-static variables outside the method or inside class
	                            // use static keyword before datatype
	 
	 static short studentMarks=980;          //** There is no default value for local variables
	
	 static int studentInt= 456785656;            
	
	 static long studentphno=1234567890;     
	
	static float studentPercentage=97.8f;            
	
	 static double studentMoney=630914724;         //sufficient for storing 15 to 16 decimal digits
	
	 static char studentInitial='O';                 //Stores a single character/letter or ASCII values
	
	 static boolean isStudent=true;
	 
	 static String studentName="vinay";             //non primitive data type --> gives null as default

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name of the student: "+studentName);
		System.out.println("age of student :"+studentAge);
		System.out.println( "student marks :"+studentMarks);
		System.out.println( "Student integers: "+studentInt);
		System.out.println("money of student: "+studentMoney);
		System.out.println("percentage of student: "+studentPercentage);
		System.out.println("student phone number: "+studentphno);
		System.out.println("Initial of student: "+studentInitial);
		System.out.println("student or not: "+isStudent);
		


	}

}
