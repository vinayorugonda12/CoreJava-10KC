package demo;

public class UsingObjects {
	
	  byte b1;
     // to use non-static variables outside the method or inside class
      // use static keyword before datatype

        short s1;          //** There is no default value for local variables
        int i1;            
        long l1;     
         float f1;            
        double d1;         //sufficient for storing 15 to 16 decimal digits
        char c1;                 //Stores a single character/letter or ASCII values
         boolean B1;
          String s;    
    

	public static void main(String[] args) {
		
		
		UsingObjects obj=new UsingObjects();  // object creation
		
		
		 System.out.println(obj.b1);     //accessing values by --> dot operator
		 System.out.println(obj.s1);
			System.out.println(obj.i1);
			System.out.println(obj.l1);
			System.out.println(obj.f1);
			System.out.println(obj.d1);
			System.out.println(obj.c1);       //prints space
			System.out.println(obj.B1);
			System.out.println(obj.s);


		

	}

}
