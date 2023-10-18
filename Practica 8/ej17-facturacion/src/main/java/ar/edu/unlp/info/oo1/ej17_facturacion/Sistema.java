package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Sistema {
	private Set<String> numerosDisponibles;
	private List<Persona> clientes;
	private List<Llamada> llamadas;
	
	public Sistema() {
		this.numerosDisponibles = new HashSet<String>();
		this.clientes = new ArrayList<Persona>();
		this.llamadas = new ArrayList<Llamada>();
	}
	
	private String randomNumero() {
		int randomIndex = new Random().nextInt(this.numerosDisponibles.size());
		List<String> converted = this.numerosDisponibles.stream().toList();
		String numero =  converted.get(randomIndex);
		this.numerosDisponibles.remove(numero);
		return numero;
	}
	
	public void agregarNumero(String n) {
		this.numerosDisponibles.add(n);
	}
	
	public Persona altaFisica(String nombre, String direccion, String dni) {
		Fisica p = new Fisica(nombre, direccion,this.randomNumero() , dni);
		
		return p;
	}
	
	public Persona altaJuridica(String nombre, String direccion, String cuit, String tipo) {
		Juridica p = new Juridica(nombre, direccion,this.randomNumero(), cuit, tipo);
		
		return p;
	}
	
	private Persona getPersonaByNumero(String n) {
		return this.clientes.stream().filter(p -> p.getNumeroTelefono().equals(n)).findFirst().orElse(null);
	}
	
	public Llamada registrarLocal(LocalDateTime fecha, int duracion, String origen, String destino) {
		Persona p = this.getPersonaByNumero(origen);
		if(p != null) {
			Llamada l = p.registrarLocal(fecha, duracion, destino);
			this.llamadas.add(l);
			return l;
		}
		
		return null;
	}
	
	public Llamada registrarInterurbana(LocalDateTime fecha, int duracion, String origen, String destino, int distancia) {
		Persona p = this.getPersonaByNumero(origen);
		if(p != null) {
			Llamada l = p.registrarInterurbana(fecha, duracion, destino, distancia);
			this.llamadas.add(l);
			return l;
		}
		
		return null;
	}
	
	public Llamada registrarInternacional(LocalDateTime fecha, int duracion, String origen, String destino, String pOrigen, String pDestino) {
		Persona p = this.getPersonaByNumero(origen);
		if(p != null) {
			Llamada l = p.registrarInternacional(fecha, duracion, destino, pOrigen, pDestino);
			this.llamadas.add(l);
			return l;
		}
		
		return null;
	}
	
	public Factura facturar(Persona p, LocalDate inicio, LocalDate fin) {
		Factura f = new Factura(p, LocalDate.now(), inicio, fin, p.getMonto(inicio, fin));
		return f;
	}
}
