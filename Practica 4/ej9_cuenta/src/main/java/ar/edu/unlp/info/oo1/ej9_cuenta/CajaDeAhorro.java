package ar.edu.unlp.info.oo1.ej9_cuenta;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo()+ (0.02 * monto)) >= monto;
	}
}
