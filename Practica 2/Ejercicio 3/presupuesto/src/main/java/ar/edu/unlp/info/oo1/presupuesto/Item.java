package ar.edu.unlp.info.oo1.presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String d, int c, double cu) {
		this.detalle = d;
		this.cantidad = c;
		this.costoUnitario = cu;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	/**
	 * Función que devuelve el costo total del item
	 * @return double
	 */
	public double costo() {
		double aux = this.costoUnitario * this.cantidad;
		
		return aux;
	}
}
