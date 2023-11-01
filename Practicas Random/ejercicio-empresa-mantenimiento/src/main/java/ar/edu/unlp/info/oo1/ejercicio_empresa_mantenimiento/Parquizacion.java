package ar.edu.unlp.info.oo1.ejercicio_empresa_mantenimiento;

public class Parquizacion extends Servicio {
	private int cantMaquinas;
	private double costoMaquina;
	
	public Parquizacion(double p, int c, int cantMaquinas, double costoMaquina) {
		super(p, c);
		this.cantMaquinas = cantMaquinas;
		this.costoMaquina = costoMaquina;
	}
	
	@Override
	public double getMonto() {
		return super.getMonto() + (this.cantMaquinas * this.costoMaquina);
	}
}
