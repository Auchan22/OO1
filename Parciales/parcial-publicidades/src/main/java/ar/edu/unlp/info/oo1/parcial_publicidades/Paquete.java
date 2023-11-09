package ar.edu.unlp.info.oo1.parcial_publicidades;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
	private List<Servicio> servicios;
	private double precio;
	
	public Paquete(List<Servicio> s) {
		this.servicios = new ArrayList<Servicio>(s);
		this.precio = s.stream().mapToDouble(se -> se.getPrecio()).sum();
	}
	
	public double getPrecio() {
		return precio;
	}
}
