package ar.edu.unlp.info.oo1.parcial_publicidades;

public abstract class Servicio {
	private double precio;
	private String descripcion;
	
	public Servicio(double p, String d) {
		this.precio = p;
		this.descripcion = d;
	}
	
	public double getPrecio() {
		return precio;
	}
}	
