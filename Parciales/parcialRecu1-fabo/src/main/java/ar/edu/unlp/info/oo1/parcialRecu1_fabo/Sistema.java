package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

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
	
	private boolean previamenteRegistrada(String patente) {
		Orden or = this.ordenes.stream().filter(o -> o.getPatente().equals(patente)).findFirst().orElse(null);
		
		return or != null;
	}
	
	public List<Factura> facturarOrdenes(List<Orden> or){
		return or.stream().map(o -> new Factura(o.getPatente(), o.getCosto(), this.previamenteRegistrada(o.getPatente()))).collect(Collectors.toList());
	}
}
