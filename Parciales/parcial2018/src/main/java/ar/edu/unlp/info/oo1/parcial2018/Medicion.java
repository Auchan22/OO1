package ar.edu.unlp.info.oo1.parcial2018;

public class Medicion {
	private int medicion;
	private int mes;
	private int anio;
	private Cliente cliente;
	
	public Medicion(Cliente c, int m, int me, int a) {
		this.cliente = c;
		this.medicion = m;
		this.mes = me;
		this.anio = a;
	}

	public int getMedicion() {
		return medicion;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}
	
	public double getMedicionTotal(double precio) {
		return this.medicion * precio;
	}
}
