package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Servicio> servicios;
	private List<Cliente> clientes;
	
	public Sistema() {
		this.servicios = new ArrayList<Servicio>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void registrarServicio(Servicio s) {
		this.servicios.add(s);
	}
	
	public List<Servicio> getServicios(){
		return new ArrayList<Servicio>(this.servicios);
	}
	
	public void registrarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void generarContrato(Cliente c, Contrato co) {
		c.generarContrato(co);
	}
	
	public double obtenerMontoAPagarByCliente(Cliente c) {
		return c.obtenerMontoAPagar();
	}
	
	public List<Servicio> getServiciosByMontoMayorA(double monto){
		return this.servicios.stream().filter(s -> s.getMonto() > monto).collect(Collectors.toList());
	}
}
