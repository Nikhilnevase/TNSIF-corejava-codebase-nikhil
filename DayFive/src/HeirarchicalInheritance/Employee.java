package HeirarchicalInheritance;

public class Employee extends Person{
	private int employeeId;
	private String dept;
	private float salary;
	public Employee(String string, String string2, int i, int j, String string3) {
		System.out.print("this is default constuctor");
		employeeId=21;
		dept = "comp";
		salary = 122344;
		
		
	}
	public Employee(int employeeId, String deot, float salary) {
		super();
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
