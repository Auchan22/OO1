package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {

	private java.time.LocalDate Fecha;
	private int cantidadDeProductos;
	private double pesoTotal, precioTotal;

	public Ticket(int ct, double pT, double prT) {
		this.Fecha = LocalDate.now();
		this.cantidadDeProductos = ct;
		this.pesoTotal = pT;
		this.precioTotal = prT;
	}

	public java.time.LocalDate getFecha() {
		return this.Fecha;
	}

	public void setFecha(java.time.LocalDate date) {
		this.Fecha = date;
	}

	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	/**
	 * Devuelve el ticket, con una fecha, la cantidad de productos, peso total y
	 * precio total
	 * 
	 * @return
	 */
	public double impuesto() {
		double aux = (this.getPrecioTotal() * 21)/100;
		
		return aux;
	}

}
