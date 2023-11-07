package ar.edu.unlp.info.oo1.parcial1_fabo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	Sistema sistema;
	Contribuyente c;
	Embarcacion embarcacionAntigua, embarcacionCara, embarcacionBarata;
	
	@BeforeEach
	void setUp() throws Exception{
		sistema = new Sistema();
		c = new Contribuyente("Agustin", "44831461", "agustinsurila@gmail.com", "Berisso");
		embarcacionAntigua = new Embarcacion(c, "123456", LocalDate.of(2003, 6, 12), 750000, "9 Reinas");
		embarcacionCara = new Embarcacion(c, "654321", LocalDate.of(2018, 1, 29), 2000000, "La odisea");
		embarcacionBarata = new Embarcacion(c, "654321", LocalDate.of(2022, 7, 6), 150000, "La venosa");
		
		sistema.altaContribuyente(c);
		sistema.altaBien(c, embarcacionAntigua);
		sistema.altaBien(c, embarcacionBarata);
		sistema.altaBien(c, embarcacionCara);
	}
	
	//@Test
	//void testAltaContribuyente() {
		//assertEquals(0, sistema.getContribuyentes().size());
		//sistema.altaContribuyente(c);
		//assertEquals(1, sistema.getContribuyentes().size());
		//assertTrue(sistema.getContribuyentes().contains(c));
	//}
	
	//@Test
	//void testAltaBien() {
		//sistema.altaBien(c, embarcacion1);
		//assertEquals(1, c.getBienes().size());
	//}
	
	@Test
	void testCalcularImpuesto() {
		assertEquals(3, c.getBienes().size());
		assertEquals(315000, c.calcularImpuestos());
	}
}
