package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Interurbana extends Llamada {

	private int distancia;

	public Interurbana(LocalDateTime fecha, int duracion, String numeroOrigen, String numeroDestino, int distancia) {
		super(fecha, duracion, numeroOrigen, numeroDestino);
		this.distancia = distancia;
	}

	public int getDistancia() {
		return distancia;
	}
	
	public double getCosto() {
		double aux = 2;;
		if(this.distancia < 100) {
			aux = 2;
		}else if (this.distancia >= 100 && this.distancia <= 500) {
			aux = 2.5;
		}else if (this.distancia > 500) {
			aux = 3;
		}
		
		return (this.duracion * aux) + 5;
	}
}
