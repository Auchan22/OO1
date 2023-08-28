package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	
	private double peso, precioPorKilo;
	private String descripcion;
	
	public Producto() {
	}

	/**
	 * Devuelve el precio del producto
	 * 
	 * @return
	 */
	public double getPrecio() {
		double total = this.peso * this.precioPorKilo;
		return total;
	}

	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
