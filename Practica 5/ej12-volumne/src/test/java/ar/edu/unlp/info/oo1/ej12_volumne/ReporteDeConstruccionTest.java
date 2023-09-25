package ar.edu.unlp.info.oo1.ej12_volumne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	ReporteDeConstruccion reporte;
	Cilindro cilindro;
	Esfera esfera;
	PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Madera", "rojo", 5, 10);
		esfera = new Esfera("Metal", "rojo", 10);
		prisma = new PrismaRectangular("Madera", "verde", 12, 8, 6);
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(esfera);
	}
	
	@Test
	public void testCilindro() {
		assertEquals(785.3981633974483, cilindro.getVolumen());
		assertEquals(471.23889803846896, cilindro.getSuperficie());
	}
	
	@Test
	public void testEsfera() {
		assertEquals(3141.592653589793, esfera.getVolumen());
		assertEquals(1256.6370614359173, esfera.getSuperficie());
	}
	
	@Test
	public void testPrisma() {
		assertEquals(576.0, prisma.getVolumen());
		assertEquals(432.0, prisma.getSuperficie());
	}
	
	@Test
	public void testVolumenMaterial() {
		assertEquals(prisma.getVolumen() + cilindro.getVolumen(), reporte.getVolumenDeMaterial("Madera"));
	}
	
	@Test
	public void testSuperficieColor() {
		assertEquals(esfera.getSuperficie() + cilindro.getSuperficie(), reporte.getSuperficieDeColor("Rojo"));
	}
	
}
