package org.generation.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins="https://localhost:5500")
@RequestMapping(path="/api/productos/")
public class productoController {
	
	@GetMapping
    public producto getProductos () {
        producto p = new producto("Plum�n tinta fugaz", "Plum�n tinta fugaz color verde para pintarr�n", "plumonVerde.jpg", 25.0);
        return p;
    } // getProductos


	
}//class productoController
