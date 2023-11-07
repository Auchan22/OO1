package ar.edu.unlp.info.oo1.parcial1_fabo;

import java.time.LocalDate;

public class Automotor extends Vehiculo {
	private String modelo, marca;

	public Automotor(Contribuyente c, String patente, LocalDate fechaFabricacion, double valor, String modelo,
			String marca) {
		super(c, patente, fechaFabricacion, valor);
		this.modelo = modelo;
		this.marca = marca;
	}
	
	@Override
	public double getImpuestosAPagar() {
		return this.getValor() * 0.05;
	}
}
