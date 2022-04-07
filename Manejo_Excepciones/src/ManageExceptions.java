import java.util.Scanner;

public class ManageExceptions {
	public void printDivide()  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		try {
		int a = scanner.nextInt();
		System.out.println("Escribe el segundo número: ");
		int b = scanner.nextInt();
		
		System.out.println("división: " + (a/b));
		String[] nombres = {"Jess", "Briana", "Alonso"};
		System.out.println("nombres[0]: " + nombres[0]);
		System.out.println("nombres[1]: " + nombres[1]);
		System.out.println("nombres[2]: " + nombres[2]);
		System.out.println("nombres[3]: " + nombres[3]);
		} catch (ArithmeticException e) {
		System.out.println("Ninún número puede ser un cero");} catch (IndexOutOfBoundsException e) {
			System.out.println("No existe ese índice del arreglo");
		} catch (Exception e) { //Lanza esta excepción en general
			System.out.println("Ocurrió otro error " + e);
		}
		finally {
			scanner.close();
		}
		}
	
	}
