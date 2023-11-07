package ar.edu.unlp.info.oo1.parcial1_fabo;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private List<Bien> bienes;
	private String nombre, dni, email, localidad;
	
	public Contribuyente(String nombre, String dni, String email, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.localidad = localidad;
		this.bienes = new ArrayList<Bien>();
	}
	
	public void cargarBien(Bien b) {
		this.bienes.add(b);
	}
	
	public double calcularImpuestos() {
		return this.bienes.stream().mapToDouble(b -> b.getImpuestosAPagar()).sum();
	}
	
	public boolean estaEnLocalidad(String l) {
		return this.localidad.equals(l);
	}
	
	public List<Bien> getBienes(){
		return new ArrayList<Bien>(this.bienes);
	}
}
