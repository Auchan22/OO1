package ar.edu.unlp.info.oo1.parcial_publicidades;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private List<Servicio> servicios;
	private List<Paquete> paquetes;
	private List<Cliente> clientes;
	
	public Agencia() {
		this.clientes = new ArrayList<Cliente>();
		this.paquetes = new ArrayList<Paquete>();
		this.servicios = new ArrayList<Servicio>();
	}
}
