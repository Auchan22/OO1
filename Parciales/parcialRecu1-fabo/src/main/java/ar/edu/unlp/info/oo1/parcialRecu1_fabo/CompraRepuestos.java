package ar.edu.unlp.info.oo1.parcialRecu1_fabo;

import java.util.ArrayList;
import java.util.List;

public class CompraRepuestos extends Orden {
	private List<Repuesto> repuestos;
	
	public CompraRepuestos(String patente, List<Repuesto> r) {
		super(patente);
		this.repuestos = new ArrayList<Repuesto>(r);
	}
	
	@Override
	public double getCosto() {
		return this.repuestos.stream().mapToDouble(r -> r.getCosto() + (r.getCosto() * r.getCantAnios() > 5 ? 0.08 : 0.15)).sum();
	}
}
