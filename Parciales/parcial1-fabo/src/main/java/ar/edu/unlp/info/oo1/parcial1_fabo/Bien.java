package ar.edu.unlp.info.oo1.parcial1_fabo;

public abstract class Bien {
	private Contribuyente contribuyente;
	
	public Bien(Contribuyente c) {
		this.contribuyente = c;
	}
	
	public abstract double getImpuestosAPagar();
	
	public abstract double getValor();
}
