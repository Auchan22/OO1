package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {

	private Figura caraBasal;
	private double altura;
	
	public Cuerpo3D() {};
	
	public void setAltura(double valor) {
		this.altura = valor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea()	* this.altura;
	}
	
	public double getSuperficieExterior() {
		double aux = (2 * this.caraBasal.getArea()) + (this.caraBasal.getPerimetro() * this.getAltura());
		return aux;
	}


}
