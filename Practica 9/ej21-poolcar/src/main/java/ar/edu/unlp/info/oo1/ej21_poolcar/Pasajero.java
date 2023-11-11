package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;

public class Pasajero extends Usuario {

	public Pasajero(String nombre) {
		super(nombre);
	}
	
	private boolean realizoAlgunViaje() {
		return this.viajes.stream().filter(v -> v.viajeHacePoco(LocalDate.now())).findFirst().orElse(null) != null;
	}
	
	@Override
	public void cargarSaldo(double m) {
		this.saldo += m * (this.realizoAlgunViaje() ? 1 : 0.1);
	}
}
