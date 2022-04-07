package constructors;

public class Person {
	//Attributes
	String name;
	int age;
	
	//Methods
	
	//Constructor Method
	public Person(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	/* NOTE: Use "this" when parameterName = attributeName
	 public Person(String name, int age) {
		this.name = name;
		this.age = age; 
	
	this.name -> attribute
	name -> parameter
	*/
	
	public void showData() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
