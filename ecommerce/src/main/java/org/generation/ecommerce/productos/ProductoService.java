package org.generation.ecommerce.productos;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service //Para indicarle que es un servicio
public class ProductoService {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	
	//Constructor
	public ProductoService() {
		lista.add(new Producto("Plumón tinta fugaz",
				"Plumón tinta fugaz color verde para pintarrón", "plumonVerde.jpg", 25.0));
		lista.add(new Producto("Borrador pintarrón",
				"Borrador para pintarrón de tinta fugaz", "borradorB.jpg", 45.0));
		lista.add(new Producto("Cuaderno profesional cuadro chico",
				"Cuaderno profesional cuadro chico Norma", "cuaderno.jpg", 40.00));
	}//Constructor
	
	public ArrayList<Producto> getProductos() {
		return lista;
	}//ArrayList

	public Producto getProducto(Long prodId) {
		for (Producto producto : lista) {
			if (producto.getId() == prodId)
				return producto;
		}
		return null;
	}//getProducto by ID

	public void deleteProducto(Long prodId) {
		for (Producto producto : lista) {
			if (producto.getId() == prodId) {
				lista.remove(producto);
				break;
			}//if
		}//for
	}//deleteProducto by ID

	public void addProducto(Producto prod) {
		// TODO Auto-generated method stub
		lista.add(prod);
	}//addProducto

	public void updateProducto(Long prodId, String nombre, String descripcion, double price, String URL_imagen) {
		// TODO Auto-generated method stub
		for (Producto producto : lista) {
			if (producto.getId() == prodId) {
				if(nombre!=null) producto.setNombre(nombre);
				if(descripcion!=null)producto.setDescripcion(descripcion);
				if(URL_imagen !=null)producto.setURL_imagen(URL_imagen);
				if(price !=0)producto.setPrice(price);
				
				// las validaciones son específicas al desarrollo
				
			}//if
		}//for
	}//updateProducto
}// class ProductoService
