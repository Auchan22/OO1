package ar.edu.unlp.info.oo1.ej19_mercado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendedorTest {
	Vendedor pepe;
	
	@BeforeEach
	void setUp() throws Exception {
		pepe = new Vendedor("Pepe", "Juan Garcia 1511");
		this.seedVendedor();
	}
	
	private void seedVendedor() {
        pepe.cargarProducto("Producto 1", "Descripción 1", 10.99, 5);
        pepe.cargarProducto("Producto 2", "Descripción 2", 15.99, 8);
        pepe.cargarProducto("Producto 3", "Descripción 3", 20.99, 3);
        pepe.cargarProducto("Producto 4", "Descripción 4", 5.99, 10);
        pepe.cargarProducto("Producto 5", "Descripción 5", 8.99, 7);
	}
	
    @Test
    public void testCargarProducto() {
    	assertNotNull(pepe.cargarProducto("Cerveza Quilmes", "El sabor del encuentro", 780, 10));
    }
    
    @Test
    public void testBuscarProducto() {
    	assertNotNull(pepe.buscarProducto("Producto 1"));
    	assertNull(pepe.buscarProducto("Producto 6"));
    }
}
