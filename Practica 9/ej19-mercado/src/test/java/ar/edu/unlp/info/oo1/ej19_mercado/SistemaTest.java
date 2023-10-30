package ar.edu.unlp.info.oo1.ej19_mercado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	private Sistema sistema;
	
	private Pedido AlContadoCorreo;
	private Pedido AlContadoComercio;
	private Pedido AlContadoDomicilio;
	private Pedido SeisCuotasCorreo;
	private Pedido SeisCuotasComercio;
	private Pedido SeisCuotasDomicilio;
	
	private Producto producto;
	private Cliente cliente;
	private Vendedor vendedor;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		vendedor = sistema.registrarVendedor("Pepe", "Juan Garcia");
		cliente = sistema.registrarCliente("Juan", "Mitre");
		producto = sistema.ponerALaVenta("Cerveza Quilmes", "El sabor del encuentro", 100, 10, vendedor);
	}
	
	@Test
	void testCrearPedido() {
		assertNotNull(sistema.crearPedido(cliente, producto, 8, new AlContado(), new RetiroComercio()));
		assertEquals(2, producto.getStock());
		assertNull(sistema.crearPedido(cliente, producto, 8, new AlContado(), new RetiroComercio()));
	}
	
	@Test
	void testBuscarProducto() {
		assertTrue(sistema.buscarProducto("Cerveza Quilmes").contains(producto));
		assertEquals(sistema.buscarProducto("Cerveza Quilmes").size(), 1);
		assertTrue(sistema.buscarProducto("aaa").isEmpty());
	}
	
	@Test
	void testBuscarVendedor() {
		assertEquals(vendedor, sistema.buscarVendedor("Pepe"));
		assertNull(sistema.buscarVendedor("Josesita"));
	}
	
	@Test
	void testBuscarCliente() {
		assertEquals(cliente, sistema.buscarCliente("Juan"));
		assertNull(sistema.buscarCliente("Josesita"));
	}
	
	@Test
	void testCostoAlContadoComercio() {
		AlContadoComercio = sistema.crearPedido(cliente, producto, 10, new AlContado(), new RetiroComercio());
		assertEquals(1050, AlContadoComercio.getCostoTotal());
	}
	
	@Test
	void testCostoAlContadoCorreo() {
		AlContadoCorreo = sistema.crearPedido(cliente, producto, 10, new AlContado(), new RetiroSucursal());
		assertEquals(1000, AlContadoCorreo.getCostoTotal());
	}
	
	@Test
	void testCostoAlContadoDomicilio() {
		AlContadoDomicilio = sistema.crearPedido(cliente, producto, 10, new AlContado(), new Domicilio());
		assertEquals(1050, AlContadoDomicilio.getCostoTotal());
	}
	
	@Test
	void testCostoSeisCuotasCorreo() {
		SeisCuotasCorreo = sistema.crearPedido(cliente, producto, 10, new SeisCuotas(), new RetiroSucursal());
		assertEquals(1200, SeisCuotasCorreo.getCostoTotal());
	}
	
	@Test
	void testCostoSeisCuotasComercio() {
		SeisCuotasComercio = sistema.crearPedido(cliente, producto, 10, new SeisCuotas(), new RetiroComercio());
		assertEquals(1250, SeisCuotasComercio.getCostoTotal());
	}
	
	@Test
	void testCostoSeisCuotasDomicilio() {
		SeisCuotasDomicilio = sistema.crearPedido(cliente, producto, 10, new SeisCuotas(), new Domicilio());
		assertEquals(1250, SeisCuotasDomicilio.getCostoTotal());
	}
}
