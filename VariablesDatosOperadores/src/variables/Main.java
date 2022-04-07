package variables;

public class Main {
	String nombre2 = "Sofi"; // instancia
	static String nombre3 = "Alejandro"; // estática
	
	public static void main(String[] args) {
		String nombre = "Sofía"; // local
		int edad = 23;
		double estatura = 1.83;
		final int nacimiento = 1998; // final
		System.out.println("Hola " + nombre + ", tienes " + edad + " años ya que naciste en el año " + nacimiento + " y mides " + estatura);
	}
}
