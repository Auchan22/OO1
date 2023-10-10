package ar.edu.unlp.info.oo1.ej15_alquiler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class SistemaTest {
	
	Usuario u1, u2, u3;
	Propiedad p1, p2, p3, p4, p5;
	Sistema s;
	
	@BeforeEach
	void setUp() throws Exception {
		s = new Sistema();
		this.inicializarUsuarios();
		this.inicializarPropiedades();
		this.registrarPropiedades();
	}
	
	private void inicializarUsuarios() {
		u1 = new Usuario("Juan", "Avenida 7 y calle 48", "12345678");
		u2 = new Usuario("Pepe", "Avenida 13 y calle 48", "87654321");
		u3 = new Usuario("Miguel", "Avenida 1 y calle 48", "11222333");
	}
	
	private void inicializarPropiedades() {
		p1 = new Propiedad("Casa 1", "Muy linda", "Calle", 5, u1);
		p2 = new Propiedad("Casa 2", "Muy linda", "Calle", 10, u1);
		p3 = new Propiedad("Casa 3", "Muy linda", "Calle", 4, u2);
		p4 = new Propiedad("Casa 4", "Muy linda", "Calle", 3, u3);
		p5 = new Propiedad("Casa 5", "Muy linda", "Calle", 9, u3);
	}
	
	private void registrarPropiedades() {
		s.registarPropiedad("Casa 1", "Muy Linda", 5, "Calle", u1);
		s.registarPropiedad("Casa 2", "Muy Linda", 10, "Calle", u1);
		s.registarPropiedad("Casa 3", "Muy Linda", 4, "Calle", u2);
		s.registarPropiedad("Casa 4", "Muy Linda", 3, "Calle", u3);
		s.registarPropiedad("Casa 5", "Muy Linda", 9, "Calle", u3);
	}
	
    @Test
    public void testRegistrarUsuario() {
        Usuario u1Creado = s.registrarUsuario("Juan", "Avenida 7 y calle 48", "12345678");
        assertNotNull(u1Creado);
        assertTrue(s.getUsuarios().contains(u1Creado));
    }
    
    @Test
    public void testRegistrarPropiedad() {
        Propiedad p = s.registarPropiedad("Casa 2", "Muy Linda", 5, "Calle", u1);
        assertNotNull(p);
        assertTrue(u1.getPropiedades().contains(p));
        assertFalse(u2.getPropiedades().contains(p));
    }
    
    @Test
    public void testPrueba() {
        assertTrue(u1.getPropiedades().contains(p1));
    }
}
