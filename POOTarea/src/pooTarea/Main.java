package pooTarea;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("Sofia","Aguilar",1,10,2022);
		student1.printFullName();
		System.out.println("Passed: "+student1.isApproved());
		System.out.println("Going ahead "+student1.changeYearIfApproved()+" years");
		
		Courses courses1 = new Courses("Mathematics", "Jorge", 1);
		
		Student student2 = new Student("Regina","Rojí",2,100,2022);
		
		Student student3 = new Student("Lily","Rabago",3,90,2021);
		
		courses1.enroll(student1);
		courses1.enroll(student2);
		courses1.enroll(student3);
		
		// Print attributes values from ArrayList
		for(Student i: courses1.students) {
			System.out.println("Nombre: "+i.firstName);
		}
		
		// Doesn't work because Courses isn't an ArrayList
				/*for(Courses i: courses1) {
					System.out.println("Nombre: "+i.professorName);
				}*/
		System.out.println(courses1.bestGrade());
	}
}
