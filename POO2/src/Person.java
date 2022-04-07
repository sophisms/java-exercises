import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {//a Person no le pagamos porque es Abstracto

	private String firstName;
	private String lastName;
	private int age;
	private String email;//propiedad de insatncia
	private static int total = 0; //propiedad de clase
	//cuenta número de personas que hay en la clase Person
	/**
	 * @param fistName
	 * @param lastName
	 * @param age
	 * @param email
	 * @throws EmailFormatException 
	 */
	public Person(String firstName, String lastName, int age, String email) throws EmailFormatException {
		super(); //¿Qué manda llamar? AL CONSTRUCTOR DE LA CLASE PADRE
		//El constructor por default es "vacío"
		total ++;
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.age = (age<18)?18:age;
		
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches()) {
			this.email = email;
		} else {
			throw new EmailFormatException("The format of email is invalid");//throw a new exception
		}//else
	}//constructor
	
	public Person() {
	}//constructor
	
	public static int getTotal(){
		return total;
	}//getTotal

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age<18)?18:age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		this.email = "noemail@nodomain.com";
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches()) {
			this.email = email;
		} else {
			throw new EmailFormatException("The format of email is invalid");//throw a new exception
		}
	}

	@Override //annotation que modifica el comportamiento del método que viene a continuación. 
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
}
