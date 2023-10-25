package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;
import java.time.Period;

public class PorHoras extends Contrato {
	private double valorHora;
	private int numHoras;
	private LocalDate fechaFin;
	
	public PorHoras(Empleado e, double valorHora, int numHoras, LocalDate fechaFin) {
		super(e);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
		this.fechaFin = fechaFin;
	}
	
	public double getValor() {
		return this.valorHora;
	}
	
	public int getHoras() {
		return this.numHoras;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	
	@Override
	public boolean estaVencido() {
		return this.fechaFin.isBefore(LocalDate.now()) || this.fechaFin.equals(LocalDate.now());
	}
	
	@Override
	public double getMonto() {
		double aux = this.valorHora * this.numHoras;
		return aux + (aux * this.getEmpleado().getAumento());
	}	
	
	@Override
	public int getDuracion() {
		return super.getDuracion(fechaFin);
	}
}
