package ar.edu.unlp.info.oo1.ej8_distribucion_electrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva, consumoEnergiaReactiva;

	public Consumo(double ea, double er) {
		this.fecha = LocalDate.now();
		this.consumoEnergiaActiva = ea;
		this.consumoEnergiaReactiva = er;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}

	public double factorDePotencia() {
		double raizCuadrada = Math.sqrt((Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2)));
		
		return this.consumoEnergiaActiva / raizCuadrada;
	}
}
