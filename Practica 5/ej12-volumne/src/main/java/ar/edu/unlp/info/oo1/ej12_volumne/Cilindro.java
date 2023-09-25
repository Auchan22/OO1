package ar.edu.unlp.info.oo1.ej12_volumne;

public class Cilindro extends Pieza {
	private int radio, altura;
	
	public Cilindro(String m, String c, int r, int a) {
		super(m, c);
		this.radio = r;
		this.altura = a;
	}

	public int getRadio() {
		return radio;
	}

	public int getAltura() {
		return altura;
	}
	
	@Override
	public double getSuperficie() {
		return (2 * Math.PI * this.radio * this.altura) + (2 *Math.PI * Math.pow(this.radio, 2));
	}
	
	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
}
