package ar.edu.unlp.info.oo1.ej19_mercado;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	Cliente juan;
	Producto producto;
	Vendedor v;
	FormaDePago f;
	MecanismoDeEnvio m;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Cliente("Juan", "25 de Mayo 2897");
		v = new Vendedor("Pepe", "Mitre");
		producto = v.cargarProducto("Producto 5", "Descripción 5", 8.99, 7);
		f = new AlContado();
		m = new RetiroComercio();
	}
	
    @Test
    public void testCrearPedido() {
    	assertNotNull(juan.crearPedido(producto, 6, f, m));
    }
}
