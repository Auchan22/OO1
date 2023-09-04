package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura {
	
	private double radio;
	
	public Circulo() {}

	public double getDiametro() {
		return this.radio * 2;
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.pow(this.radio, 2) * Math.PI;
	}

	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	
	

}
