package ar.edu.unlp.info.oo1.ej12_volumne;

public class PrismaRectangular extends Pieza {
	private int ladoMayor, ladoMenor, altura;
	
	public PrismaRectangular(String n, String c, int lma, int lme, int a) {
		super(n, c);
		this.ladoMayor = lma;
		this.ladoMenor = lme;
		this.altura = a;
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getAltura() {
		return altura;
	}
	
	@Override
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	@Override
	public double getSuperficie() {
		return 2 * ((this.ladoMayor * this.ladoMenor) + (this.ladoMayor * this.altura) + (this.ladoMenor * this.altura));
	}
}
