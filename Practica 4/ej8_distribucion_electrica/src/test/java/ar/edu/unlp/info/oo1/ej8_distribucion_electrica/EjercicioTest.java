package ar.edu.unlp.info.oo1.ej8_distribucion_electrica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EjercicioTest {
	
	Distribuidora distribuidora;
	Usuario u1, u2, u3, u4;
	Consumo c1, c2;

	@BeforeEach
	void setUp() throws Exception {
		distribuidora = new Distribuidora();
		distribuidora.precioKWh(200);
		u1 = new Usuario("Juan", "Avenida 7");
		u2 = new Usuario("Micaela", "Avenida 8");
		c1 = new Consumo(10, 15);
		u1.agregarMedicion(c1);
		c1 = new Consumo(200, 35);
		u1.agregarMedicion(c1);
		c2 = new Consumo(20, 35);
		u2.agregarMedicion(c1);
		u2.agregarMedicion(c2);
		distribuidora.agregarUsuario(u2);
		distribuidora.agregarUsuario(u1);
	}
	
	@Test
	public void testPrecioKWh() {
		assertEquals(200, distribuidora.getPrecioKWh());
	}
	
	@Test
	public void testAgregarUsuario() {
		int count = distribuidora.getUsuarios().size();
		assertEquals(2, count);
		u4 = new Usuario("Pepe", "Calle 13");
		this.distribuidora.agregarUsuario(u4);
		count = distribuidora.getUsuarios().size();
		assertEquals(3, count);
	}
	
	@Test
	public void testAgregarConsumicion() {
		assertNotNull(u1.getUltimoConsumo());
	}
	
	@Test
	public void testEmitirFacturas() {
		int count = this.distribuidora.facturar().size();
		assertEquals(2, count);
	}
	
	@Test
	public void testConsumoTotal() {
		double total = this.distribuidora.consumoTotalActiva();
		assertEquals(220, total);
	}
	
	@Test
	public void testDireccionRepetida() {
		u3 = new Usuario("Mingo", "Avenida 7");
		this.distribuidora.agregarUsuario(u3);
		int count = this.distribuidora.getUsuarios().size();
		assertEquals(2, count);
	}
	
}
