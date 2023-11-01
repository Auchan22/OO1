package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

public class Limpieza extends Servicio {
	private double tarifaMinima;

	public Limpieza(double p, int c, double tarifaMinima) {
		super(p, c);
		this.tarifaMinima = tarifaMinima;
	}
	
	@Override
	public double getMonto() {
		double aux = super.getMonto();
		return aux < tarifaMinima ? tarifaMinima : aux;
	}
}
