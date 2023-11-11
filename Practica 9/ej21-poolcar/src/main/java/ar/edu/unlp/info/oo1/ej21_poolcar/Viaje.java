package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen, destino;
	private double costoTotal;
	private Vehiculo v;
	private LocalDate fechaViaje;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo v, LocalDate fechaViaje) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.v = v;
		this.fechaViaje = fechaViaje;
		this.pasajeros = new ArrayList<Usuario>();
		this.pasajeros.add(v.getDueño());
	}
	
	public boolean viajeHacePoco(LocalDate fecha) {
		int diff = (int)ChronoUnit.DAYS.between(fecha, fechaViaje);
		return diff > 30;
	}
	
	public void registrarPasajero(Pasajero p) {
		if(!p.tieneSaldoEnCero() || v.tieneCapacidad()) {
			this.pasajeros.add(p);
			v.ocuparEspacio();
		}
	}
	
	public boolean empiezaDiaSiguiente() {
		return this.fechaViaje.isAfter(LocalDate.now());
	}
	
	public void procesarViaje() {
		this.pasajeros.stream().map(p -> p.descontarSaldo(costoTotal / ))
	}
	
	
}
