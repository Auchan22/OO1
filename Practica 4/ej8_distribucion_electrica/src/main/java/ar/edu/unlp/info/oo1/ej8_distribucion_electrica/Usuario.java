package ar.edu.unlp.info.oo1.ej8_distribucion_electrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre, domicilio;
	private List<Consumo> consumos;
	private List <Factura> facturas;
	
	public Consumo getUltimoConsumo() {
		return this.consumos.get(this.consumos.size() - 1);
	}

	public Usuario(String n, String d) {
		this.nombre = n;
		this.domicilio = d;
		this.consumos = new ArrayList<Consumo>();
		this.facturas = new ArrayList<Factura>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		if(this.getUltimoConsumo() == null) {
			return 0;
		}else {
			return this.getUltimoConsumo().getConsumoEnergiaActiva();
		}
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo uc = this.getUltimoConsumo();
		if(uc != null) {
			double fpe = uc.factorDePotencia();
			double costo = uc.costoEnBaseA(precioKWh);
			
			return new Factura(costo, fpe > 0.8);
		}
		return null;
	}
	
	public ArrayList<Factura> facturas(){
		return new ArrayList<Factura>(this.facturas);
	}
}
