package collections;

import java.util.ArrayList;

public class arrayLoop {
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Fiat");
		cars.add("Volvo");
		
		//for(int i=0;i<cars.size();i++) {
			
			//System.out.println(cars.get(i));
		//}
		
		for(String i:cars) {
			
			System.out.println(i);
			
		}

	}

}
