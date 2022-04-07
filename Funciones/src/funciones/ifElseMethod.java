package funciones;

import java.util.Scanner;

public class ifElseMethod {
	static void access(int age) {
		if(age<18) {
			System.out.println("Access denied");
		}else {
			System.out.println("Access approved");
		}
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter age: ");
		int input = s1.nextInt();
		access(input);
	}
}
