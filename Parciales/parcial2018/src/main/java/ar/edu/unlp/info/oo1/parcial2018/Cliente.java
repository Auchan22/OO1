package ar.edu.unlp.info.oo1.parcial2018;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String domicilio;
	protected List<Medicion> mediciones;
	protected Tarifario tarifario;
	
	public Cliente(String nombre, String domicilio, Tarifario t) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.tarifario = t;
		this.mediciones = new ArrayList<Medicion>();
	}
	
	public abstract double calcularConsumo(int m, int a);
	
	public Medicion registrarMedicion(int c, int me, int a) {
		Medicion m = new Medicion(this, c, me, a);
		
		this.mediciones.add(m);
		return m;
	}
	
}
