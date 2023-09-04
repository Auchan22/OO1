package ar.edu.unlp.info.oo1.presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto( String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		double aux = 0;
		
		for(Item i: items) {
			aux += i.costo();
		}
		
		return aux;
	}
}
