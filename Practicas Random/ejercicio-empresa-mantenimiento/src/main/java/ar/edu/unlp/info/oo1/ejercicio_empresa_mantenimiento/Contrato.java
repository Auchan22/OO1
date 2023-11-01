package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import java.time.LocalDate;

public abstract class Contrato {
	protected LocalDate fechaInicio;
	protected Servicio servicio;
	
	public Contrato(LocalDate d, Servicio s) {
		this.fechaInicio = d;
		this.servicio = s;
	}
	
	public double getMonto() {
		return this.servicio.getMonto();
	};
	
	public Servicio getServicio() {
		return this.servicio;
	}
}
