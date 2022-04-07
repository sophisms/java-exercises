package org.generation.ecommerce.productos;

//@Entity
//@Table(name="Producto")
public class Producto {//POJO Plain Old Java Objects
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id", unique = true, nullable = false)
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double price;
	private int id;
	private static int total = 0;
	
	//Constructors//
	public Producto(String nombre, String descripcion, String uRL_imagen, double price) {
		super();
		total++;
		this.id = total;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.price = price;
	}//constructor
	public Producto() {
		super();
		total++;
		this.id = total;
	}//empty constructor - needed for HTML PUT method
	//\Constructors//
	
	public int getId() {
		return id;
	}//getId

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion

	public String getURL_imagen() {
		return URL_imagen;
	}//getURL_imagen

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}//setURL_imagen

	public double getPrice() {
		return price;
	}//getPrice

	public void setPrice(double price) {
		this.price = price;
	}//setPrice

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen + ", price="
				+ price + "]";
	}//toString
	
}//class Producto
