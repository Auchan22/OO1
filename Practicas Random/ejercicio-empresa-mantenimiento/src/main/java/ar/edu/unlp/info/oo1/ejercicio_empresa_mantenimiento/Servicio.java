package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

public abstract class Servicio {
	private double precioHora;
	private int cantHoras;
	
	public Servicio(double p, int c) {
		this.precioHora = p;
		this.cantHoras = c;
	}
	
	public double getMonto() {
		return this.precioHora * this.cantHoras;
	}
}
