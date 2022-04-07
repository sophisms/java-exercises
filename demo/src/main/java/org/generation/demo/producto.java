package org.generation.demo;

public class producto {
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;
	
	public producto(String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_Imagen = uRL_Imagen;
		this.precio = precio;
	}//constructor

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

	public String getURL_Imagen() {
		return URL_Imagen;
	}//getURL_Imagen

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}//setURL_Imagen

	public double getPrecio() {
		return precio;
	}//getPrecio

	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio

	@Override
	public String toString() {
		return "producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen=" + URL_Imagen
				+ ", precio=" + precio + "]";
	}//toString
	
}//class producto
