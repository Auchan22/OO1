package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad;
	private int añoFabricacion;
	private double valorMercado;
	
	public Vehiculo(Conductor dueño, String descripcion, int capacidad, int añoFabricacion, double valorMercado) {
		this.dueño = dueño;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.añoFabricacion = añoFabricacion;
		this.valorMercado = valorMercado;
	}
	
	public boolean tieneCapacidad() {
		return this.capacidad > 0;
	}
	
	public void ocuparEspacio() {
		if(tieneCapacidad()) {
			this.capacidad++;
		}
	}

	public boolean mayorACincoAnios(int anio) {
		return (this.añoFabricacion - anio) > 5;
	}
	
	public Conductor getDueño() {
		return this.dueño;
	}
}
