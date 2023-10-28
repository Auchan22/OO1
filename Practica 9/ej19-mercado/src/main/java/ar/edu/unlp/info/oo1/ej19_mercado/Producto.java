package ar.edu.unlp.info.oo1.ej19_mercado;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int unidadesDisponibles;
	private Vendedor vendedor;
	
	public Producto(String nombre, String descripcion, double precio, int unidadesDisponibles, Vendedor v) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesDisponibles = unidadesDisponibles;
		this.vendedor = v;
	}
	
	public boolean tieneUnidades(int c) {
		return this.unidadesDisponibles >= c;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
