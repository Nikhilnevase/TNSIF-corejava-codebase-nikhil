package Staticmethod;

public class EmployeeDemo {
	
	public static void main(String []args) {
		
		Employee e = new Employee ("nikhil", 1001);
		Employee.companyname="dyp";
		System.out.print(e);
		
	}

}
