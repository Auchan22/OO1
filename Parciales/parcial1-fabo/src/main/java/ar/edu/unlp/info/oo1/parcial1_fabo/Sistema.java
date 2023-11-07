package ar.edu.unlp.info.oo1.parcial1_fabo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Contribuyente> contribuyentes;
	
	public Sistema() {
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public void altaContribuyente(Contribuyente c) {
		this.contribuyentes.add(c);
	}
	
	public void altaBien(Contribuyente c, Bien b) {
		c.cargarBien(b);
	}
	
	public double calcularImpuestos(Contribuyente c) {
		return c.calcularImpuestos();
	}
	
	public List<Contribuyente> getContribuyentesMasPagan(String l, int n){
		return this.contribuyentes.stream().filter(c -> c.estaEnLocalidad(l)).sorted((c1, c2) -> Double.compare(c1.calcularImpuestos(),  c2.calcularImpuestos())).limit(n).collect(Collectors.toList());
	}
	
	public List<Contribuyente> getContribuyentes(){
		return new ArrayList<Contribuyente>(this.contribuyentes);
	}
	
}
