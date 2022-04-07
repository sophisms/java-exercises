package org.generation.ecommercedb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto { // POJO Plain Old Java Objects, mapeada directamente con una tabla llamada "Producto"
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;
	
	//1. Constructor con fields
	//   1.1. Constructor vacio
	//2.  Getter y setters
	//3.toString
	
	//1. Constructor con fields
	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_Imagen = uRL_Imagen;
		this.precio = precio;
	}//constructor Producto with fields
	
	//  1.1. Constructor vacio
	public Producto() {
		// TODO Auto-generated constructor stub
	}//constructor Producto without fields
	
	
	//2.  Getter y setters
	
	public Long getId() {
		return id;
	}//getId

	public void setId(Long id) {
		this.id = id;
	}//setId

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

	

	//3.toString

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen="
				+ URL_Imagen + ", precio=" + precio + "]";
	}//toString
	

}//class producto
