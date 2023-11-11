package ar.edu.unlp.info.oo1.ej21_poolcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Usuario {
	private String nombre;
	protected double saldo;
	protected List<Viaje> viajes;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.saldo = 0;
		this.viajes = new ArrayList<Viaje>();
	}
	
	public boolean tieneSaldoEnCero() {
		return this.saldo <= 0;
	}
	
	public abstract void cargarSaldo(double m);
	
	public List<Viaje> getViajesDiaSiguiente(){
		return this.viajes.stream().filter(v -> v.empiezaDiaSiguiente()).collect(Collectors.toList());
	}
	
	public void descontarSaldo(double m) {
		this.saldo -= m;
	}
	
	
}
