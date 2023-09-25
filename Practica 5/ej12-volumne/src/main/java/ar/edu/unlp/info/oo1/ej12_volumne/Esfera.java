package ar.edu.unlp.info.oo1.ej12_volumne;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String n, String c, int r) {
		super(n, c);
		this.radio = r;
	}

	public int getRadio() {
		return radio;
	}
	
	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
	
	@Override
	public double getVolumen() {
		return (4/3) * Math.PI * Math.pow(this.radio, 3);
	}
}
