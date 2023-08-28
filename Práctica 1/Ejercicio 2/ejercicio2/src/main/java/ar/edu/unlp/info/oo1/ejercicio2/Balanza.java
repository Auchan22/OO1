package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {

	private int cantidadDeProductos = 0;
	private double precioTotal, pesoTotal;

	public Balanza() {
	}

	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}

	/**
	 * Setea la cantidad de productos, precio total y peso total en cero
	 * 
	 * @return
	 */
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}

	/**
	 * Agrega un producto a los productos actuales que posee la balanza
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}

	/**
	 * Permite devolver un ticket con el precio total, peso total y cantidad de
	 * productos
	 * 
	 * @return Ticket
	 */
	public Ticket emitirTicket() {
		Ticket t = new Ticket();
		t.setFecha(LocalDate.now());
		t.setCantidadDeProductos(this.cantidadDeProductos);
		t.setPesoTotal(this.pesoTotal);
		t.setPrecioTotal(this.precioTotal);
		
		return t;
	};
}
