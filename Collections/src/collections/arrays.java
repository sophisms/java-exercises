package collections;

import java.util.*;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arreglo[] = {"Mau", "Sofi", "Sam","Abril"};
		
		System.out.println(arreglo[0]);
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		System.out.println(cars);
		//Acceder a un art�culo
		
		cars.get(0);
		System.out.println(cars.get(0));
		cars.add("Mazda");
		System.out.println(cars);
		//Cambiar un art�culo
		cars.set(0, "Susuki");
		System.out.println(cars);
		//Eliminar un art�culo
		cars.remove(1);
		System.out.println(cars);
		//Tama�o de ArrayList
		System.out.println(cars.size());
		
		
		
		for(String i:cars) {
			
			System.out.println(i);
		}

	}

}
