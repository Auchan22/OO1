package ar.edu.unlp.info.oo1.parcial_publicidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Servicio> servicios;
	private List<Paquete> paquetes;
	
	public Cliente() {
		this.servicios = new ArrayList<Servicio>();
		this.paquetes = new ArrayList<Paquete>();
	}
	
	public List<Servicio> getServicios(){
		return new ArrayList<Servicio>(this.servicios);
	}
	
	public List<Paquete> getPaquetes(){
		return new ArrayList<Paquete>(this.paquetes);
	}
	
	public abstract double getDescuento();
}
