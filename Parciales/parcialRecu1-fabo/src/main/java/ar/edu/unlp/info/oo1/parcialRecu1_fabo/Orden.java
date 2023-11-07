package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.time.LocalDate;

public abstract class Orden {
	private String patente;
	private LocalDate fecha;
	
	public Orden(String patente) {
		this.patente = patente;
		this.fecha = LocalDate.now();
	}
	
	
	public abstract double getCosto();
	
	public String getPatente() {
		return this.patente;
	}
}
