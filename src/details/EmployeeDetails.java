package details;

public class EmployeeDetails {
	char employeeInitial='O';
	 String employeename="vinay";

	 byte  employeeAge=21;
	short  employeeHeight=161;
	long  employeeNumber=630914724;
	 float employeeSalary=30000.0f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails obj=new EmployeeDetails();
		
		System.out.println(obj.employeeInitial);
		System.out.println(obj.employeename);
		System.out.println(obj.employeeAge);
		System.out.println(obj.employeeHeight);
		System.out.println(obj.employeeNumber);
		System.out.println(obj.employeeSalary);

	}

}
