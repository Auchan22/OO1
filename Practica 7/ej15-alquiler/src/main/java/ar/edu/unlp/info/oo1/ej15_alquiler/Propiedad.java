package ar.edu.unlp.info.oo1.ej15_alquiler;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioNoche;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String n, String d, String dir, double p, Usuario pr) {
		this.nombre = n;
		this.descripcion = d;
		this.direccion = dir;
		this.precioNoche = p;
		this.propietario = pr;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public boolean estaDisponible(DateLapse intervalo) {
		//Devuelve un boolean para indicar si alguna de las reservas que estan 
		//vinculadas con esta propiedad, se encuentra o no en el intervalo  de tiempo indicado
		return this.reservas.stream().noneMatch(r -> r.cumple(intervalo));
	}
}
