package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {
	private String patente;
	private LocalDate fecha;
	protected List<Repuesto> repuestos;
	
	public Orden(String patente, List<Repuesto> r) {
		this.patente = patente;
		this.fecha = LocalDate.now();
		this.repuestos = new ArrayList<Repuesto>(r);
	}
	
	public Factura generarFactura(boolean tieneDescuento) {
		return new Factura(this.patente, this.getCosto(), tieneDescuento);
	}
	
	public int getAntiguedad() {
		return (int)ChronoUnit.YEARS.between(fecha, LocalDate.now());
	}

	
	public abstract double getCosto();
	
	public String getPatente() {
		return this.patente;
	}
	
	public double getTotalRepuestos() {
		return this.repuestos.stream().mapToDouble(r -> r.getCosto()).sum();
	}
}
