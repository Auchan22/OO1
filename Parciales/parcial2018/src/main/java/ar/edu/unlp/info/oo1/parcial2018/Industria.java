package ar.edu.unlp.info.oo1.parcial2018;

public class Industria extends Cliente{

	public Industria(String nombre, String domicilio, Tarifario t) {
		super(nombre, domicilio, t);
	}
	
	@Override
	public double calcularConsumo(int m, int a) {
		Medicion me = this.mediciones.stream().filter(med -> med.getAnio() == a && med.getMes() == m).findFirst().orElse(null);
		
		boolean tieneDescuento = this.
		double aux = 0;
		
		if(me != null) {
			aux = me.getMedicionTotal(this.tarifario.getPrecioIndustria());
		}
		
		return aux;
	}
	
}
