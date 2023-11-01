package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnicaVez extends Contrato {

	public UnicaVez(LocalDate d, Servicio s) {
		super(d, s);
	}
	
	private boolean esFinde() {
		DayOfWeek dia = DayOfWeek.from(this.fechaInicio);
		return dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY);
	}
	
	@Override
	public double getMonto() {
		double aux = super.getMonto();
		aux += (esFinde() ? aux * 0.15 : 0);
		
		return aux;
	}
	
}
