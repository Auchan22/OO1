package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

public class Empleado {
	private	String nombreCompleto;
	private double valorHora;
	
	public Empleado(String nombreCompleto, double valorHora) {
		this.nombreCompleto = nombreCompleto;
		this.valorHora = valorHora;
	}
	
	public double getValorHora(){
		return this.valorHora;
	}
}
