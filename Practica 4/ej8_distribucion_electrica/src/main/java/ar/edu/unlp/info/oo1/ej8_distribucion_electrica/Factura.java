package ar.edu.unlp.info.oo1.ej8_distribucion_electrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva, descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double m, boolean descuento) {
		this.montoEnergiaActiva = m;
		this.fecha = LocalDate.now();
		this.descuento = descuento ? 0.1 : 0;
	}
	
	public double montoTotal() {
		return 0;
	}
	
	public Usuario usuario() {
		return this.usuario;
	}
	
	public LocalDate fecha() {
		return this.fecha;
	}
	
	public double descuento() {
		return this.descuento;
	}
}
