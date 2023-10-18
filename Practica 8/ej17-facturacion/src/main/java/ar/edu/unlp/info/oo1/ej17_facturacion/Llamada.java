package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public abstract class Llamada {
	protected LocalDateTime fecha;
	protected int duracion;
	protected String numeroOrigen;
	protected String numeroDestino;
	
	public Llamada(LocalDateTime fecha, int duracion, String numeroOrigen, String numeroDestino) {
		super();
		this.fecha = fecha;
		this.duracion = duracion;
		this.numeroOrigen = numeroOrigen;
		this.numeroDestino = numeroDestino;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getNumeroOrigen() {
		return numeroOrigen;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}
	
	public abstract double getCosto();
	
}
