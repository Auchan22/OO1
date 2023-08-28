package ar.edu.unlp.info.oo1.ejercicio2;

public class Ticket {

	private java.time.LocalDate Fecha;
	private int cantidadDeProductos;
	private double pesoTotal, precioTotal;

	public Ticket() {
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

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
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
