package pooTarea;

import java.util.ArrayList;
import java.util.Collections;

public class Courses {
	String courseName;
	String professorName;
	int year;
	ArrayList<Student> students = new ArrayList<Student>();

	public Courses(String courseName, String professorName, int year) {
		super();
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}

	public void enroll(Student student) {
		//TODO add the student to the collection
		students.add(student);
	}

	public void unEnroll(Student student){
		//TODO remove this student from the collection
		// Hint: check if that really is this student
		if(students.contains(student))
			students.remove(student);
		else
			System.out.println("Ese alumno no pertenece a este curso");
	}

	public int countStudents(){
		return students.size();
	}

	/*public int bestGrade(){
		//TODO implement
		ArrayList<Integer> grades = new ArrayList<Integer>();
		for(Student i: students) {
			grades.add(i.grade);
		}
		System.out.println(grades);
		//Collections.sort(grades,Collections.reverseOrder());
		int maxGrade = Collections.max(grades);
		System.out.println(maxGrade);
		
		//Find student with maxGrade
		ArrayList<String> maxName = new ArrayList<String>();
		for(Student i: students) {
			if(i.grade == maxGrade) {
				maxName.add(i.firstName);
				System.out.println(maxName);
				
			}
		return 0;
		}
	}*/
	public int bestGrade(){
		ArrayList<Integer> grades = new ArrayList<Integer>();
		for (Student i : students) {
			grades.add(i.grade);
		}
		//Collections.sort(grades);
		int best = Collections.max(grades);
		return best;
		/*for (Student i : students) {
			if (best == i.grade)
				return i.firstName;
		} */
	}

}