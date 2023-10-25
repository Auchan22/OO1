package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;

public class Recibo {
	private Empleado empleado;
	private LocalDate fechaGeneracion;
	private double montoTotal;
	
	public Recibo(Empleado e, double monto) {
		this.empleado = e;
		this.montoTotal = monto;
		this.fechaGeneracion = LocalDate.now();
	}
	
	public String getNombre() {
		return empleado.getNombre();
	}
	
	public String getApellido() {
		return empleado.getApellido();
	}
	
	public String getCUIL() {
		return empleado.getCUIL();
	}
	
	public int getAntiguedad() {
		return empleado.getAntiguedad();
	}
	
	public LocalDate getFechaGeneracion() {
		return fechaGeneracion;
	}
	
	public double getMontoTotal() {
		return montoTotal;
	}
}
