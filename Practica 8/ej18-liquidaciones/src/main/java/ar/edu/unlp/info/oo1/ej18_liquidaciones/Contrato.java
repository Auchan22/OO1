package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;
import java.time.Period;

public abstract class Contrato {
	protected LocalDate fechaInicio;
	protected Empleado empleado;
	
	public Contrato(Empleado e) {
		this.fechaInicio = LocalDate.now();
		this.empleado = e;
	}
	
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	};
	
	public abstract double getMonto();
	
	public abstract boolean estaVencido();
	
	public int getDuracion(LocalDate fecha) {
		Period antiguedad = Period.between(this.fechaInicio, fecha);
		return antiguedad.getYears();
	};
	
	public abstract int getDuracion();
}
