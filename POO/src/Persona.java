
public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Guillermo", "Chang", 34);
		System.out.println("El nombre de la persona es "+persona1.getNombre()+" "+persona1.getApellido()+", y tiene "+persona1.getEdad()+" años");
	
		Persona persona2 = new Persona("","",0); //No le doy valores para asignarlos después con los SETTERS
		
		persona2.setNombre("Felipe");
		persona2.setApellido("Maqueda");
		persona2.setEdad(29);
		
		System.out.println("El nombre de la persona es "+persona2.getNombre()+" "+persona2.getApellido()+", y tiene "+persona2.getEdad()+" años");
	}
		
	/*
	//Constructor vacío para crear nuevos objetos de la misma clase con atributos sin valores
	public Persona() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}*/
	
	// Constructor
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
