package ar.edu.unlp.info.oo1.ej9_cuenta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	CuentaCorriente ca, cb;
	
	@BeforeEach
	void setUp() {
		ca = new CuentaCorriente();
		cb = new CuentaCorriente();
		
		ca.setDescubierto(1500);
		
		ca.depositar(1500);
		cb.depositar(3000);
	}
	
	@Test
	public void testDepositar() {
		assertEquals(1500, ca.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertEquals(true, ca.puedeExtraer(80));
		assertEquals(false, ca.puedeExtraer(3500));
	}
	
	@Test
	public void testExtraer() {
		assertEquals(true, ca.extraer(80));
		assertEquals(false, ca.extraer(10000));
	}
	
	@Test
	public void testTransferir() {
		assertEquals(true, ca.transferir(1500, cb));
		assertEquals(4500, cb.getSaldo());
		assertEquals(0, ca.getSaldo());
		assertEquals(true, ca.transferir(600, cb));
		assertEquals(5100, cb.getSaldo());
		assertEquals(false, ca.transferir(1000, cb));
	}
}
