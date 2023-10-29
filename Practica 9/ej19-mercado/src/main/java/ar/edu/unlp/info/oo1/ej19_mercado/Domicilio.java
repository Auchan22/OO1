package ar.edu.unlp.info.oo1.ej19_mercado;

public class Domicilio extends MecanismoDeEnvio {
	
	private Mapa m;

	public Domicilio() {
		super();
		this.m = new Mapa();
	}
	
	@Override
	public double calcularEnvio(String a, String b) {
		double distancia = this.m.distanciaEntre(a, b);
		
		return 0.5 * distancia;
	}
	
}
