package variables;

public class Main {
	String nombre2 = "Sofi"; // instancia
	static String nombre3 = "Alejandro"; // est�tica
	
	public static void main(String[] args) {
		String nombre = "Sof�a"; // local
		int edad = 23;
		double estatura = 1.83;
		final int nacimiento = 1998; // final
		System.out.println("Hola " + nombre + ", tienes " + edad + " a�os ya que naciste en el a�o " + nacimiento + " y mides " + estatura);
	}
}
