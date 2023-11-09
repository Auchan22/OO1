package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen, destino;
	private double costoTotal;
	private Vehiculo v;
	private LocalDate fechaViaje;
	private List<Pasajero> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo v, LocalDate fechaViaje) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.v = v;
		this.fechaViaje = fechaViaje;
		this.pasajeros = new ArrayList<Pasajero>();
	}
	
	
}
