// Esta clase ser� nuestra plantilla. Nos ayudar� a crear un mont�n de gatitos

public class Gatito {// Definimos nuestra clase "Gatito". Esta clase nos ayudar� a darle caracter�sticas generales a nuestros gatitos
	
	// ATRIBUTOS
	private String nombre; // Variable tipo cadena
	private String color;
	private String ojos;
	private String raza;
	private int edad;
	
	public static void main(String[] args) { // Main para crear instancias
		Gatito gatito1 = new Gatito("Perejil", "negro", "caf�", "esfinge", 3);
		Gatito gatito2 = new Gatito("Cilantro", "blanco", "azul", "Main", 4);
		
		System.out.println("Mi gatito se llama "+gatito2.getNombre()+" es de color "+gatito2.getColor()+" tiene ojos color "+gatito2.getOjos()+" es de raza "+gatito2.getRaza()+" y tiene "+gatito2.getEdad()+" a�os de edad");
	}
	
	// CONSTRUCTOR
	public Gatito (String nom, String col, String ojos, String raz, int ed) {
		this.nombre = nom;
		this.color = col;
		this.raza = raz;
		this.edad = ed;
		this.ojos = ojos;
	}
	
	public Gatito() {
		this.nombre=""; // nombre vac�o
		this.color=""; // color vac�o
		this.raza=""; // raza vac�a
		this.edad=0; // edad cero
		this.ojos="";
	}

	/* Constructor generado a trav�s de "Source"
	public Gatito(String nombre, String color, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.edad = edad;
	}
	*/

	// M�TODOS
	public String consultarNombre (){ // Consultamos el nombre
	    return nombre;
	}

	public String consultarColor() { // Consultamos el color
		return color;
	}

	public String consultarRaza (){ // Consultamos la raza
	    return raza;
	}

	public int consultarEdad (){ // Consultamos la edad
	    return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// GETTERS y SETTERS para los M�TODOS
	// Source > Generate getters and setters
	
	
}
