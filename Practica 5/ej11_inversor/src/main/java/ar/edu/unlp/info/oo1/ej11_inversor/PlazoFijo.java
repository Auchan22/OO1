package ar.edu.unlp.info.oo1.ej11_inversor;

import java.time.LocalDate;
import java.time.Period;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado, porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate f, double m, double p) {
		this.fechaDeConstitucion = f;
		this.montoDepositado = m; 
		this.porcentajeDeInteresDiario = p;
	}

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public void depositar(double monto) {
		this.montoDepositado += monto;
	}
	
	public double getPorcentaje() {
		return (this.porcentajeDeInteresDiario * this.montoDepositado)/100;
	}
	
	public double valorActual() {
		Period period = Period.between(this.fechaDeConstitucion, LocalDate.now());
		int diff = period.getDays();
		return (this.montoDepositado + this.getPorcentaje()) * diff;
	}
}
