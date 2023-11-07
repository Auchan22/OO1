package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.util.List;

public class Reparacion extends Orden {
	private String descripcion;
	private List<Repuesto> repuestos;
	private List<Empleado> empleados;
	private int cantHoras;
	
	public Reparacion(String patente, String descripcion, List<Repuesto> repuestos, List<Empleado> empleados,
			int cantHoras) {
		super(patente);
		this.descripcion = descripcion;
		this.repuestos = repuestos;
		this.empleados = empleados;
		this.cantHoras = cantHoras;
	}
	
	@Override
	public double getCosto() {
		double auxEmpleados = this.empleados.stream().mapToDouble(e -> e.getValorHora() * this.cantHoras).sum();
		double auxRepuestos = this.repuestos.stream().mapToDouble(r -> r.getCosto()).sum();
		double aux = auxEmpleados + auxRepuestos;
		
		return aux + (aux * 0.1);
	}
}
