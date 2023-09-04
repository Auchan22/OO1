package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura {
	
	private double lado;
	
	public Cuadrado() {};
	
	public void setLado(double valor) {
		this.lado = valor;
	}
	
	public double getLado() {
		return this.lado;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	@Override
	public double getPerimetro() {
		return this.lado * 4;
	}

}
