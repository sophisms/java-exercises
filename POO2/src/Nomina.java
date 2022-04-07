
public class Nomina {
	//con INTERFAZ
	public static void calculaPagos(Pagable e){
	System.out.println("====================");
	System.out.println("Cálculo de Pago " + e);
	System.out.println("====================");
	System.out.println(e.calculateSalary() - (e.calculateSalary() * 0.30));
	System.out.println("====================");
	}//method calculaPagos
	
//con CLASE
//	public static void calculaPagos(Employee e){
//		System.out.println("====================");
//		System.out.println("Cálculo de Pago " + e);
//		System.out.println("====================");
//		System.out.println(e.calculateSalary() - (e.calculateSalary() * 0.30));
//		System.out.println("====================");
//	}//method calculaPagos

}//class Nomina
