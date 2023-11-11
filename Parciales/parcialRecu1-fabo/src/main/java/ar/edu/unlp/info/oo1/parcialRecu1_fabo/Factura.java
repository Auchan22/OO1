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
		this.monto = getMontoFinal(monto);
		this.descuento = d;
	}
	
	private double getMontoFinal(double m) {
		if(this.descuento) {
			return m * 1.05;
		}
		return m;
	}
}
