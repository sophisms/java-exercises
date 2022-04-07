public class Manager extends Employee implements Pagable {
	
	private int numberOfEmployees;
	private float percentage;
	private static int total=0;
	
	public Manager(String firstName, String lastName, int age, String email, String department, double salary,
			int numberOfEmployees, float percentage) throws EmailFormatException {
		
		super(firstName, lastName, age, email, department, salary);
		total++;
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
		
	}// constructor
	
	@Override
	public double calculateSalary() {
		return (this.getSalary() * 21 * 1.16) * (percentage + 1) * 1.16;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage + ", getDepartment()="
				+ getDepartment() + ", getSalary()=" + getSalary() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
	}
	
	public static int getTotal(){
		return total;
	}//getTotal
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	} //getNumberOfEmployees

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	} //setNumberOfEmployees

	public float getPercentage() {
		return percentage;
	} //getPercentage

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	} //setPercentage
	
}// Class Manager
