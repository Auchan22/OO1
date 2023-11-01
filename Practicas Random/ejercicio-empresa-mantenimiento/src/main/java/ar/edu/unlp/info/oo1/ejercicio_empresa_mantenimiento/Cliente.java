package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import java.util.ArrayList;
import java.util.List;

class Cliente {
	private String nombre, direccion;
	private List<Contrato> contratos; 

	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public void generarContrato(Contrato c) {
		this.contratos.add(c);
	}
	
	public List<Contrato> getContratos(){
		return new ArrayList<Contrato>(this.contratos);
	}
	
	public double obtenerMontoAPagar() {
		return this.contratos.stream().mapToDouble(c -> c.getMonto()).sum();
	}
}

