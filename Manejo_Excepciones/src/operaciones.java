
public class operaciones {
	public static void main(String[] args) {
		int x = 20;
		int y = 2;
		try {
		System.out.println(x/y);
		} catch(ArithmeticException ae) {
			System.out.println("No puedes dividir entre cero");
		y = 1;
		System.out.println(x/y);
		} finally {
		System.out.println("Terminamos");
		}
	}
}
// El try...catch es como un if...else pero con excepciones
