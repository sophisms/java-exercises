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
		System.out.println("Ingresa el primer n�mero: ");
		double num1 = s1.nextDouble();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Ingresa el segundo n�mero: ");
		double num2 = s2.nextDouble();
		
		System.out.println("La suma es: " + suma(num1,num2));
		System.out.println("La resta es: " + resta(num1,num2));
		System.out.println("La multiplicaci�n es: " + multiplicacion(num1,num2));
		System.out.println("La divisi�n es: " + division(num1,num2));
		System.out.println("La raiz cuadrada del primer n�mero es: " + raizCuadrada(num1));
		System.out.println("La potencia del primer n�mero al segundo n�mero es: " + potencia(num1, num2));
	}
}
