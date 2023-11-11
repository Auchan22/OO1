package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.util.List;

public class Reparacion extends Orden {
	private String descripcion;
	private List<Empleado> empleados;
	private int cantHoras;

	
	public Reparacion(String patente, List<Repuesto> r, String descripcion, List<Empleado> empleados, int cantHoras) {
		super(patente, r);
		this.descripcion = descripcion;
		this.empleados = empleados;
		this.cantHoras = cantHoras;
	}

	private double getTotalEmpleados() {
		return this.empleados.stream().mapToDouble(e -> e.getValorHora() * this.cantHoras).sum();
	}
	
	@Override
	public double getCosto() {
		return (super.getTotalRepuestos() + this.getTotalEmpleados()) * 1.1;
	}
}
