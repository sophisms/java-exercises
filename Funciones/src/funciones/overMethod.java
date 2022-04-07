package funciones;

public class overMethod {
	
	static int myMethod(int age) {
		return age;
	}
	
	static float myMethod(float height) {
		return height;
	}
	
	static double myMethod(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("Mi edad es: " + myMethod(34));
		System.out.println("Mi estatura es es: " + myMethod(1.70f));
		System.out.println("La suma de dos números aleatorios es: " + myMethod(1.5,3.8));
	}
}
