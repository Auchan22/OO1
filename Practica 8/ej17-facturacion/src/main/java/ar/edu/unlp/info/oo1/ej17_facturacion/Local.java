package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Local extends Llamada {

	public Local(LocalDateTime fecha, int duracion, String numeroOrigen, String numeroDestino) {
		super(fecha, duracion, numeroOrigen, numeroDestino);
	}

	public double getCosto() {
		return this.duracion;
	}
}
