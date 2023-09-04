package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {

	private List<Producto> productos;

	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}

	
	public int getCantidadDeProductos() {
		return (int) this.productos.stream().count();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(value -> value.getPrecio()).sum();	
	}


	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(value -> value.getPeso()).sum();	
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}

	/**
	 * Setea la cantidad de productos, precio total y peso total en cero
	 * 
	 * @return
	 */
	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}

	/**
	 * Agrega un producto a los productos actuales que posee la balanza
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	/**
	 * Permite devolver un ticket con el precio total, peso total y cantidad de
	 * productos
	 * 
	 * @return Ticket
	 */
	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
		
		return t;
	};
}
