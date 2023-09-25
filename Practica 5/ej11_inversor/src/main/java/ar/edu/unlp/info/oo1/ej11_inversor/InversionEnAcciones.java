package ar.edu.unlp.info.oo1.ej11_inversor;

public class InversionEnAcciones implements Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String n, int c, double v) {
		this.nombre = n;
		this.cantidad = c;
		this.valorUnitario = v;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
