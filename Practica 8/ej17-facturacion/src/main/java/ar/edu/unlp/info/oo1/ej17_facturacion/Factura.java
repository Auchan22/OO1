package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDate;

public class Factura {
	private Persona cliente;
	private LocalDate fecha;
	private LocalDate inicio;
	private LocalDate fin;
	private double montoTotal;
	
	public Factura(Persona cliente, LocalDate fecha, LocalDate inicio, LocalDate fin, double montoTotal) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
		this.inicio = inicio;
		this.fin = fin;
		this.montoTotal = montoTotal;
	}
	
	
}
