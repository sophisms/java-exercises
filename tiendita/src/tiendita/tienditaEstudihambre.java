package tiendita;
import java.util.*;

public class tienditaEstudihambre {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la tiendita de los estudiambres, \nA continuaci�n te ofrecemos el siguiente men�... \n1. Paquete b�sico \n2. Paquete chucher�as \n3. Paquete sano \n4. Paquete rom�ntico");
		System.out.println("Introduce el n�mero que corresponde a la opci�n que quieres");
		Scanner scan = new Scanner (System.in);
		double option = scan.nextInt();
		if(option == 1) {
			System.out.println("El precio del paquete 1000");
		}else if(option == 2) {
			System.out.println("El precio del paquete 2000");
		}else if(option == 3) {
			System.out.println("El precio del paquete 3000");
		}else if(option == 4) {
			System.out.println("El precio del paquete 4000");
		}else {
			System.out.println("Hoy no me surtieron de esa joven... hijole joven te la debo... hoy no fio, ma�ana s�... no hay yaaa");
		}
			
			}

}
