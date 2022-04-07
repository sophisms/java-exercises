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
        producto p = new producto("Plumón tinta fugaz", "Plumón tinta fugaz color verde para pintarrón", "plumonVerde.jpg", 25.0);
        return p;
    } // getProductos


	
}//class productoController
