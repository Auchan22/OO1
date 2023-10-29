package ar.edu.unlp.info.oo1.ej19_mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	
	public Sistema() {
		this.clientes = new ArrayList<Cliente>();
		this.vendedores = new ArrayList<Vendedor>();
	}
	
	public Vendedor registrarVendedor(String nombre, String direccion) {
		Vendedor v = new Vendedor(nombre, direccion);
		this.vendedores.add(v);
		return v;
	}
	
	public Cliente registrarCliente(String nombre, String direccion) {
		Cliente c = new Cliente(nombre, direccion);
		this.clientes.add(c);
		return c;
	}
	
//	private Persona buscarPersonaByNombre(String nombre, List<Persona> l) {
//		return l.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
//	}

	
	public Vendedor buscarVendedor(String nombre) {
		return this.vendedores.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public Cliente buscarCliente(String nombre) {
		return this.clientes.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public Producto ponerALaVenta(String nombre, String descripcion, double precio, int cantidad, Vendedor v) {
		if(v != null) {
			Producto p = v.cargarProducto(nombre, descripcion, precio, cantidad);
			return p;
		}
		return null;
	}
	
	public List<Producto> buscarProducto(String nombre) {
		return this.vendedores.stream().map(v -> v.buscarProducto(nombre)).collect(Collectors.toList());
	}
	
	public void crearPedido(Cliente c, Producto p, int cant, FormaDePago pago, MecanismoDeEnvio m) {
		if(p.tieneUnidades(cant)) {
			c.crearPedido(p, cant, pago, m);
			p.removerCantidades(cant);
		}
	}
	
	public double calcularCostoPedido(Pedido p) {
		if(p != null) {
			return p.getCostoTotal();
		}
		return 0;
	}
}
