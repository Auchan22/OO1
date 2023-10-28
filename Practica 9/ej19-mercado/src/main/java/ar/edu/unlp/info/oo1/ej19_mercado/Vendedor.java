package ar.edu.unlp.info.oo1.ej19_mercado;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
	private List<Producto> productos;

	public Vendedor(String n, String d) {
		super(n, d);
		this.productos = new ArrayList<Producto>();
	}
	
	public Producto buscarProducto(String nombre) {
		return this.productos.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public Producto cargarProducto(String nombre, String descripcion, double precio, int cantidad) {
		Producto p = new Producto(nombre, descripcion, precio, cantidad, this);
		this.productos.add(p);
		return p;
	}
	
}
