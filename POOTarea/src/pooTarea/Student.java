package pooTarea;

public class Student {
    String maxNamemaxName;
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    //Constructor
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
    
    //Methods
	public void printFullName(){
    	//TODO implement
        System.out.println("Name: "+this.firstName+" "+this.lastName);
     }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (this.grade>=60) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congratulations" if the student has been approved
    	 boolean pass = this.isApproved();
         if (pass) {
        	 this.year += 1;
        	 System.out.println("Congratulations!");
         }
         return 0;
     }
}
