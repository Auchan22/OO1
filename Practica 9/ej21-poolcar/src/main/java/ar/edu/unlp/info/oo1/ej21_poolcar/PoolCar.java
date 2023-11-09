package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.util.ArrayList;
import java.util.List;

public class PoolCar {
	private List<Conductor> conductores;
	private List<Pasajero> pasajeros;
	
	public PoolCar() {
		this.conductores = new ArrayList<Conductor>();
		this.pasajeros = new ArrayList<Pasajero>();
	}
	
	public Conductor altaConductor(String nombre, Vehiculo v) {
		Conductor c = new Conductor(nombre, v);
		this.conductores.add(c);
		
		return c;
	}
	
	public Pasajero altaPasajero(String nombre)
	{
		Pasajero p = new Pasajero(nombre);
		this.pasajeros.add(p);
		
		return p;
	}
	
	public void cargarSaldo(Usuario u, double m)
}
