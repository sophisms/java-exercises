package org.generation.ecommerce.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/productos/")
@CrossOrigin(origins="*") //acepto solicitudes desde cualquier URL (el deber ser es especificarlo)

public class ProductoController {
	
	private final ProductoService prodService;
	
	@Autowired //nos está haciendo el favor de instanciar ProductoService sin tener que ponerle new ProductoService... y además lo está haciendo solo en el momento correcto
	// Cuando se ejecuta el Web Application Context, busca todos los Autowired y los corre.
	public ProductoController(ProductoService prodService) { // recibe como parámetro al servicio ya instanciado
		this.prodService = prodService;
	}//Constructor
	
	@GetMapping //está jalando lo que esté en la url
	public List<Producto> getProductos() {
		return prodService.getProductos();
	}//retrievesProductos
	
	@GetMapping(path="{prodId}") //está jalando el id que ponemos en la url y la está pasando como parámetro
	public Producto getProducto(@PathVariable("prodId") Long prodId) {
		return prodService.getProducto(prodId);
	}//retrievesProducto by ID
	
	@PostMapping
	public void addProducto(@RequestBody Producto prod) {
		prodService.addProducto(prod);
	}//addProducto
	
	@PutMapping(path="{prodId}") 
	public void updateProducto(@PathVariable("prodId") Long prodId, @RequestParam(required=false) String nombre, @RequestParam(required=false) String descripcion, @RequestParam(required=false) double price, @RequestParam(required=false) String URL_imagen) {
		prodService.updateProducto (prodId, nombre, descripcion, price, URL_imagen);
	}//updateProducto
	
	// el REQUIRED tiene que ver con si queremos que el llenado de esos campos sea obligatorio
	
	@DeleteMapping (path="{prodId}")
	public void deleteProducto(@PathVariable("prodId") Long prodId) {
		prodService.deleteProducto(prodId);
	}//deleteProducto
	
}
