package ar.edu.unlp.info.oo1.ej17_facturacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FisicaTest {
	Fisica miguel, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		miguel = new Fisica("Miguel", "Juan B. Justo y Alem", "22333444", "24256176");
		guido = new Fisica("Guido", "Calle 8", "11112222", "44831461");
		
	}
	
    @Test
    public void testNombre() {
        assertEquals("Miguel", miguel.getNombre());
        assertEquals("Guido", guido.getNombre());
    }
    
    @Test
    public void testDNI() {
        assertEquals("24256176", miguel.getDni());
        assertEquals("44831461", guido.getDni());
    }
}
