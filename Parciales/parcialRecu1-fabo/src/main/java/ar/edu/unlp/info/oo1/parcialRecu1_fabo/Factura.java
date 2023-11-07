package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private String patente;
	private double monto;
	private boolean descuento;
	
	public Factura(String patente, double monto, boolean d) {
		this.fecha = LocalDate.now();
		this.patente = patente;
		this.monto = monto;
		this.descuento = d;
	}
	
	public double getMontoFinal() {
		return this.monto - (descuento ? this.monto * 0.05 : 0); 
	}
}
