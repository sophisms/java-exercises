package funciones;

import java.util.Scanner;

public class calculadora {
	static double suma(double a,double b) {
		return a+b;
	}
	
	static double resta(double a,double b) {
		return a-b;
	}
	
	static double multiplicacion(double a,double b) {
		return a*b;
	}
	
	static double division(double a,double b) {
		return a/b;
	}
	
	static double raizCuadrada(double a) {
		return Math.sqrt(a);
	}
	
	static double potencia(double a, double b) {
		return Math.pow(a,b);
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		double num1 = s1.nextDouble();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Ingresa el segundo número: ");
		double num2 = s2.nextDouble();
		
		System.out.println("La suma es: " + suma(num1,num2));
		System.out.println("La resta es: " + resta(num1,num2));
		System.out.println("La multiplicación es: " + multiplicacion(num1,num2));
		System.out.println("La división es: " + division(num1,num2));
		System.out.println("La raiz cuadrada del primer número es: " + raizCuadrada(num1));
		System.out.println("La potencia del primer número al segundo número es: " + potencia(num1, num2));
	}
}
