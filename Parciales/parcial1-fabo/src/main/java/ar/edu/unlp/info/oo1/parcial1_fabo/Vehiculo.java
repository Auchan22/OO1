package ar.edu.unlp.info.oo1.parcial1_fabo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo extends Bien {
	private String patente;
	private LocalDate fechaFabricacion;
	private double valor;
	
	public Vehiculo(Contribuyente c, String patente, LocalDate fechaFabricacion, double valor) {
		super(c);
		this.patente = patente;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}
	
	protected int calcularAnios() {
		long diff = ChronoUnit.YEARS.between(fechaFabricacion, LocalDate.now());
		return (int)diff;
	}
	
	@Override
	public double getValor() {
		return valor;
	}
}
