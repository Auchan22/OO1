package ar.edu.unlp.info.oo1.ej19_mercado;

public class AlContado extends FormaDePago {

	public AlContado() {
		super();
	}
	
	@Override
	public double calcularPago(double monto) {
		return super.calcularPago(monto) * 0;
	}

}
