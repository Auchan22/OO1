package ar.edu.unlp.info.oo1.ej9_cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {
	CajaDeAhorro ca, cb;
	
	@BeforeEach
	void setUp() {
		ca = new CajaDeAhorro();
		ca.depositar(2000);
		cb = new CajaDeAhorro();
		cb.depositar(10);
	}
	
	@Test
	public void testDepositar() {
		assertEquals(2000, ca.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertEquals(true, ca.puedeExtraer(80));
		assertEquals(false, ca.puedeExtraer(10000));
	}
	
	@Test
	public void testExtraer() {
		assertEquals(true, ca.extraer(80));
		assertEquals(false, ca.extraer(10000));
	}
	
	@Test
	public void testTransferir() {
		assertEquals(true, ca.transferir(1500, cb));
		assertEquals(1510, cb.getSaldo());
		assertEquals(500, ca.getSaldo());
		assertEquals(false, ca.transferir(600, cb));
	}
}
