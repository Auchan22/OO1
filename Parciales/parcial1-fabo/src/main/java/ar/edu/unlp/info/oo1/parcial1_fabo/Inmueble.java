package ar.edu.unlp.info.oo1.parcial1_fabo;

public class Inmueble extends Bien {
	private int nroPartida;
	private double valorLote;
	private double valorEdificacion;
	
	public Inmueble(Contribuyente c, int nroPartida, double valorLote, double valorEdificacion) {
		super(c);
		this.nroPartida = nroPartida;
		this.valorLote = valorLote;
		this.valorEdificacion = valorEdificacion;
	}
	
	@Override
	public double getValor() {
		return this.valorEdificacion + this.valorLote;
	}
	
	@Override
	public double getImpuestosAPagar() {
		return this.getValor() * 0.01;
	}
}
