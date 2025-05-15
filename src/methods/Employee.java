package methods;
public class Employee {

	int employeeId;
	String employeeName;
	double employeeSalary;

	public double calculateAnnualSalary(int Totalsalary) {
		return Totalsalary * 12;
	}

	public void displayEmployeeDetails(int id, String name, int salary) {
		System.out.println("Employee Id:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Monthly salary:" + salary);
		System.out.println("Employee Annual Salary:" + calculateAnnualSalary(salary));
		System.out.println();

	}

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		Employee obj4 = new Employee();
		Employee obj5 = new Employee();

		obj1.displayEmployeeDetails(201, "vinay", 80000);
		obj2.displayEmployeeDetails(202, "akhil", 120000);
		obj3.displayEmployeeDetails(203, "devraj", 100000);
		obj4.displayEmployeeDetails(204, "vijay", 110000);
		obj5.displayEmployeeDetails(205, "gowtham", 90000);
	}

}
