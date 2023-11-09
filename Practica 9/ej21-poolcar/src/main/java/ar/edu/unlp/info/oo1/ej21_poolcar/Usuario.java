package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	private List<Viaje> viajes;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.saldo = 0;
		this.viajes = new ArrayList<Viaje>();
	}
	
	public boolean tieneSaldoEnCero() {
		return this.saldo <= 0;
	}
	
	public abstract void cargarSaldo(double m);
	
	
}
