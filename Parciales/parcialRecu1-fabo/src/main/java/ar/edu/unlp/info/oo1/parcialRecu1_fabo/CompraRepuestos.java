package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.util.ArrayList;
import java.util.List;

public class CompraRepuestos extends Orden {

	
	public CompraRepuestos(String patente, List<Repuesto> r) {
		super(patente, r);
		// TODO Auto-generated constructor stub
	}
	
	private boolean aplicarDescuento() {
		return this.repuestos.stream().anyMatch(r -> r.getCantAnios() > 5);
	}
	
	private double getIncremento() {
		if(this.aplicarDescuento()) {
			return 1.08;
		}
		return 1.15;
	}
	
	@Override
	public double getCosto() {
		return super.getTotalRepuestos()*this.getIncremento();
	}
}
