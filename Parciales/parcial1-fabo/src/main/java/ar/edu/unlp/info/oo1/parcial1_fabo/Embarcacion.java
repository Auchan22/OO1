package ar.edu.unlp.info.oo1.parcial1_fabo;

import java.time.LocalDate;

public class Embarcacion extends Vehiculo {
	private String nombre;

	public Embarcacion(Contribuyente c, String patente, LocalDate fechaFabricacion, double valor, String nombre) {
		super(c, patente, fechaFabricacion, valor);
		this.nombre = nombre;
	}
	
	@Override
	public double getImpuestosAPagar() {
		if(this.calcularAnios() > 10) {
			return 0;
		}
		
		return this.getValor() * (this.getValor() < 1000000 ? 0.10 : 0.15);
	}
}
