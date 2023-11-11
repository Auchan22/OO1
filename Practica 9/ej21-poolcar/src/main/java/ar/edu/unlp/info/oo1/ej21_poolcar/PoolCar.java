package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PoolCar {
	private List<Usuario> usuarios;
	
	public PoolCar() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Conductor altaConductor(String nombre, Vehiculo v) {
		Conductor c = new Conductor(nombre, v);
		this.usuarios.add(c);
		
		return c;
	}
	
	public Pasajero altaPasajero(String nombre)
	{
		Pasajero p = new Pasajero(nombre);
		this.usuarios.add(p);
		
		return p;
	}
	
	public void cargarSaldo(Usuario u, double m) {
		if(this.usuarios.contains(u)) {
			u.cargarSaldo(m);
		}
	}
	
	public void cargarMontoRegalo(double m) {
		this.usuarios.stream().forEach(u -> u.cargarSaldo(m));
	}
	
	public Viaje altaViaje(String origen, String destino, double costoTotal, Vehiculo v, LocalDate fecha) {
		Viaje ve = new Viaje(origen, destino, costoTotal, v, fecha);
		
		return ve;
	}
	
	public List<Viaje> listarViajesDiaSiguiente(){
		return this.usuarios.stream().map(u -> u.getViajesDiaSiguiente()).flatMap(List::stream).collect(Collectors.toList());
	}
	
	public void procesarViajes() {
		this.listarViajesDiaSiguiente().stream().map(v -> v.procesarViaje())
	}
}
