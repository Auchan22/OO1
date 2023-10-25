package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;

public class Planta extends Contrato {

	private double saldo;
	private double montoConyuge;
	private double montoHijo;
	
	public Planta(Empleado e, double saldo, double montoConyuge, double montoHijo) {
		super(e);
		this.saldo = saldo;
		this.montoConyuge = montoConyuge;
		this.montoHijo = montoHijo;
	}
	
	@Override
	public boolean estaVencido() {
		return false;
	}
	
	@Override
	public double getMonto() {
		double aux = this.saldo + (this.empleado.isTieneConyuge() ? this.montoConyuge : 0) + (this.empleado.isTieneHijos() ? this.montoHijo : 0);
		return aux + (aux * this.getEmpleado().getAumento());
	}
	
	@Override
	public int getDuracion() {
		return super.getDuracion(LocalDate.now());
	}
	
}
