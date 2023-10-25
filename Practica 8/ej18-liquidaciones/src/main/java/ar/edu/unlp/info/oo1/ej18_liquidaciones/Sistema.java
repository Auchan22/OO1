package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sistema {
	private List<Empleado> empleados;

	public Sistema() {
		this.empleados = new ArrayList<Empleado>();
	}

	public void altaEmpleado(String n, String a, String c, LocalDate f, boolean co, boolean h) {
		Empleado e = new Empleado(n, a, c, f, co, h);
		this.empleados.add(e);
	}

	public Empleado buscarEmpleado(String c) {
		return this.empleados.stream().filter(e -> e.getCUIL().equals(c)).findFirst().orElse(null);
	}

	public boolean bajaEmpleado(Empleado e) {
		return this.empleados.remove(e);
	}

	public void cargarHoras(Empleado e, LocalDate fechaInicio, double valor, int horas, LocalDate fechaFin) {
		e.cargarHoras(fechaInicio, valor, horas, fechaFin);
	}

	public void cargarPlanta(Empleado e, LocalDate fechaInicio, double sueldo, double montoConyuge, double montoHijos) {
		e.cargarPlanta(fechaInicio, sueldo, montoConyuge, montoHijos);
	}
	
	public List<Recibo> generarRecibos(){
		return this.empleados.stream().map(e -> e.generarRecibo()).collect(Collectors.toList());
	}
	
	public List<Empleado> getEmpleadosConContratosVencido(){
		return this.empleados.stream().filter(e -> e.tieneContratoVencido()).collect(Collectors.toList());
	}
}
