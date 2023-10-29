package ar.edu.unlp.info.oo1.ej19_mercado;

public class SeisCuotas extends FormaDePago {

	public SeisCuotas() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPago(double monto) {
		return super.calcularPago(monto) * 0.2;
	}
}
