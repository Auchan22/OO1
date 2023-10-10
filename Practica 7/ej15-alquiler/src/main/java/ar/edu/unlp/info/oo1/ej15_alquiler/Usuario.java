package ar.edu.unlp.info.oo1.ej15_alquiler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String n, String d, String dni) {
		this.nombre = n;
		this.direccion = d;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}
	
	public void agregarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse intervalo){
		return this.propiedades.stream().filter(p -> p.estaDisponible(intervalo)).collect(Collectors.toList());
	}
}
