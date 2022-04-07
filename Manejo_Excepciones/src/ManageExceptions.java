import java.util.Scanner;

public class ManageExceptions {
	public void printDivide()  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe el primer n�mero: ");
		try {
		int a = scanner.nextInt();
		System.out.println("Escribe el segundo n�mero: ");
		int b = scanner.nextInt();
		
		System.out.println("divisi�n: " + (a/b));
		String[] nombres = {"Jess", "Briana", "Alonso"};
		System.out.println("nombres[0]: " + nombres[0]);
		System.out.println("nombres[1]: " + nombres[1]);
		System.out.println("nombres[2]: " + nombres[2]);
		System.out.println("nombres[3]: " + nombres[3]);
		} catch (ArithmeticException e) {
		System.out.println("Nin�n n�mero puede ser un cero");} catch (IndexOutOfBoundsException e) {
			System.out.println("No existe ese �ndice del arreglo");
		} catch (Exception e) { //Lanza esta excepci�n en general
			System.out.println("Ocurri� otro error " + e);
		}
		finally {
			scanner.close();
		}
		}
	
	}
