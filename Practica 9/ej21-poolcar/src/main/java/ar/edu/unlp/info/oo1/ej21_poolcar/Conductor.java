package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;

public class Conductor extends Usuario {

	private Vehiculo vehiculo;
	
	public Conductor(String nombre, Vehiculo v) {
		super(nombre);
		this.vehiculo = v;
	}

	@Override
	public void cargarSaldo(double m) {
		this.saldo += m * (vehiculo.mayorACincoAnios(LocalDate.now().getYear()) ? 0.1 : 0.01);		
	}
	
	
}
