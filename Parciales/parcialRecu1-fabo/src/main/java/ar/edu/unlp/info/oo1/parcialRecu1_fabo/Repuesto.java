package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Repuesto {
	private String nombre;
	private LocalDate fechaFabricacion;
	private double costo;
	
	public Repuesto(String nombre, LocalDate fechaFabricacion, double costo) {
		this.nombre = nombre;
		this.fechaFabricacion = fechaFabricacion;
		this.costo = costo;
	}
	
	public int getCantAnios() {
		long diff = ChronoUnit.YEARS.between(fechaFabricacion, LocalDate.now());
		return (int)diff;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	
}
