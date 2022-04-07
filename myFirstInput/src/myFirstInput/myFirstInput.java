package myFirstInput;
import java.util.*;

public class myFirstInput {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Please enter your name ");
		String name = console.next();

		System.out.println("My name is "+ name);
	}
}