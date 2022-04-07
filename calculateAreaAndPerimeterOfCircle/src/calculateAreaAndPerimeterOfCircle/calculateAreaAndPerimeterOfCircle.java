package calculateAreaAndPerimeterOfCircle;

import java.util.Scanner;

public class calculateAreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		
		int diameter;
		double radious;
		double area;
		double perimeter;
		//calculates the area and perimeter of the circle.
		System.out.println("introduce the diameter: ");
		diameter = SC.nextInt();

		radious = ((double)diameter/2) ; // Casting
		area = (radious * radious)* Math.PI ;
		perimeter = Math.PI * radious;
	
	
		System.out.println("perimeter: " + perimeter + " and area of circle: " + area);
	}// end of main 
}

