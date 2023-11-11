package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Repuesto> repuestos;
	private List<Empleado> empleados;
	private List<Orden> ordenes;
	
	public Sistema() {
		this.empleados = new ArrayList<Empleado>();
		this.repuestos = new ArrayList<Repuesto>();
		this.ordenes = new ArrayList<Orden>();
	}
	
	public Empleado altaEmpleado(String nombre, double valor) {
		Empleado e = new Empleado(nombre, valor);
		
		this.empleados.add(e);
		
		return e;
	}
	
	public Repuesto altaRespuesto(String nombre, LocalDate fecha, double costo) {
		Repuesto r = new Repuesto(nombre, fecha, costo);
		this.repuestos.add(r);
		
		return r;
	}
	
	public void registrarOrden(Orden o) {
		this.ordenes.add(o);
	}
	
	private boolean cumpleCondicion(Orden o) {
		return this.ordenes.stream().anyMatch(or -> or.getPatente().equals(o.getPatente()) && or.getAntiguedad() <= 1);
	}
	
	public List<Factura> facturarOrdenes(List<Orden> o){
		return o.stream().map((Orden or) -> or.generarFactura(this.cumpleCondicion(or))).collect(Collectors.toList());
	}
}
