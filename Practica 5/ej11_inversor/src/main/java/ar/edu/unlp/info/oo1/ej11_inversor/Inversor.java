package ar.edu.unlp.info.oo1.ej11_inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String n) {
		this.nombre = n;
		this.inversiones = new ArrayList<Inversion>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Inversion> getInversiones() {
		return new ArrayList<Inversion>(this.inversiones);
	}
	
	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}
}
