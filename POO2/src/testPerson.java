
public class testPerson {

	public static void main(String[] args) {
		
		Person alonso = null;
		
		try {
			//-------------------- Briana --------------------------------
			System.out.println("Jess---------------------------");
			Employee jess = new Employee("Jess", "Hernandez", 20, "jess.hernandez@generation.org", "Mentoría", 120);
			System.out.println(jess.calculateSalary());
			System.out.println(jess);
			
			//-------------------- Briana --------------------------------
			System.out.println("Briana---------------------------");
			Employee briana = new Employee("Briana", "Valencia", 20, "briana.valencia@generation.org", "Mentoría", 120);
			System.out.println(briana.calculateSalary());
			System.out.println(briana);
			
			//-------------------- Rufs --------------------------------
			System.out.println("\nRufs------------------------");
			Manager rufs = new Manager("Rufino", "Tamayo", 50, "elrufus@gmail.com", "Logística", 1500.0, 20, 0.25f);
			System.out.println(rufs.calculateSalary());
			System.out.println(rufs);
			
			//-------------------- Alonso --------------------------------
			System.out.println("\nAlonso----------------------");
			//alonso = new Person("Alonso", "Grajeda", 15, "alonso@gmail.com");
			alonso = new Employee("Alonso", "Grajeda", 15, "alonso@gmail.com", "Mentoría", 150);
			System.out.println(((Employee) alonso).calculateSalary());
			alonso.setAge(22);
//			alonso.setFirstName("Alonso Ismael");
//			alonso.setEmail("correoraroyahoocom");
			
			//-------------------- Pepito --------------------------------
			System.out.println("\nPepito------------------------");
			Proveedor pepito = new Proveedor("Pepito el hamster", 40, 150);
			System.out.println(pepito);
			Nomina.calculaPagos(jess);
			Nomina.calculaPagos(briana);
			Nomina.calculaPagos(rufs);
			Nomina.calculaPagos(pepito);
		}
		catch (EmailFormatException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(alonso);
			System.out.println("Número de personas: "+Person.getTotal());
			System.out.println("Número de empleados: "+Employee.getTotal());
			System.out.println("Número de gerentes: "+Manager.getTotal());
//			System.out.println("Total de personas: " + Person.total); //---Ya no se puede porque ahora es private
//			System.out.println(alonso.getEmail());
//			System.out.println(alonso.getAge());
//			System.out.println(alonso.getFirstName());
		}

	}

}
