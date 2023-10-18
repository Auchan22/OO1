package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Internacional extends Llamada {
	private String paisOrigen;
	private String paisDestino;
	
	public Internacional(LocalDateTime fecha, int duracion, String numeroOrigen, String numeroDestino, String paisOrigen,
			String paisDestino) {
		super(fecha, duracion, numeroOrigen, numeroDestino);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}
	
	public double getCosto() {
		boolean isDiurno = this.fecha.getHour() >= 8 && this.fecha.getHour() <= 20;
		
		double aux = isDiurno ? 4 : 3;
		
		return this.duracion * aux;
	}
}
