package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import java.time.LocalDate;

public class Prolongado extends Contrato {
	private int cantDias;

	public Prolongado(LocalDate d, Servicio s, int cantDias) {
		super(d, s);
		this.cantDias = cantDias;
	}
	
	@Override
	public double getMonto() {
		double aux = super.getMonto() * cantDias;
		aux = cantDias > 5 ? aux * 0.10 : aux;
		return aux;
	}
}
