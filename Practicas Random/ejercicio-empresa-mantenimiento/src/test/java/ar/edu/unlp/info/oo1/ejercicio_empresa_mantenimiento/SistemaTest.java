package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	Sistema sistema;
	
	Limpieza servicioLimpieza;
	Parquizacion servicioParquizacion;
	
	@BeforeEach
	void setUp() throws Exception
	{
		sistema = new Sistema();
	}
	
	@Test
	void testRegistrarServicioLimpieza() {
		servicioLimpieza = new Limpieza(10, 5, 45);
		sistema.registrarServicio(servicioLimpieza);
		assertTrue(sistema.getServicios().contains(servicioLimpieza));
	}
	
	@Test
	void testRegistrarServicioParquizacion() {
		servicioParquizacion = new Parquizacion(10, 5, 2, 10);
		sistema.registrarServicio(servicioParquizacion);
		assertTrue(sistema.getServicios().contains(servicioParquizacion));
	}
}
