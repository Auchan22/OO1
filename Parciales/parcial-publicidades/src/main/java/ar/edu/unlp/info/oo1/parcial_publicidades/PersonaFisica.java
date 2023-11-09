package ar.edu.unlp.info.oo1.parcial_publicidades;

public class PersonaFisica extends Cliente {
	private int comprasRestantes;

	public PersonaFisica() {
		super();
		this.comprasRestantes = 11;
	}
	
	@Override
	public double getDescuento() {
		if(this.comprasRestantes > 0) {			
			this.comprasRestantes--;
			return this.comprasRestantes/100;
		}
		return 0;
	}
	
	
}
