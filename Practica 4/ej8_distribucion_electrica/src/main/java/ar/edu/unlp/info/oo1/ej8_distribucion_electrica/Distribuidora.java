package ar.edu.unlp.info.oo1.ej8_distribucion_electrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario u) {
		boolean existUsuario = this.usuarios.stream().anyMatch(usuario->usuario.getDomicilio().equals(u.getDomicilio()));
		
		if(!existUsuario) {
			this.usuarios.add(u);
		}
	}
	
	public ArrayList<Factura> facturar() {
		List<Factura> facturas = new ArrayList<Factura>();
		this.usuarios.forEach(c -> facturas.add(c.facturarEnBaseA(precioKWh)));
		return new ArrayList<Factura>(facturas);
	}
	
	public double consumoTotalActiva() {
		double sum = this.usuarios.stream().mapToDouble(u -> {
			Consumo uc = u.getUltimoConsumo();
			return uc != null ? uc.getConsumoEnergiaActiva() : 0;
		}).sum();
		
		return sum;
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}

	public double getPrecioKWh() {
		return precioKWh;
	}

	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(this.usuarios);
	}
	
	
}
