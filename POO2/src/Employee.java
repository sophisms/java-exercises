
public class Employee extends Person implements Pagable {
	//empty constructor is needed to inherit (Person)
	private String department;
	private double salary;
	private static int total=0;
	
	public Employee(String firstName, String lastName, int age, String email, String department, double salary)
			throws EmailFormatException {
		super(firstName, lastName, age, email);
		total++;
		this.department = department;
		this.salary = salary;
	}//constructor
	
	public double calculateSalary() {
		return this.salary * 21 * 1.16;
	}
	
	public static int getTotal(){
		return total;
	}//getTotal
	public String getDepartment() {
		return department;
	}//getDepartment
	public void setDepartment(String department) {
		this.department = department;
	}//setDepartment
	public double getSalary() {
		return salary;
	}//getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "- Employee [department=" + department + ", salary=" + salary + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [department=" + department + ", salary=" + salary + ", getFirstName()=" + getFirstName()
//				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
//	}
	

	
	
}//class Employee
