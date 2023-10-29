package ar.edu.unlp.info.oo1.ej19_mercado;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
	
	private List<Pedido> pedidos;

	public Cliente(String n, String d) {
		super(n, d);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public Pedido crearPedido(Producto p, int cantidad, FormaDePago pago, MecanismoDeEnvio envio) {
		Pedido pe = new Pedido(this, p, cantidad, pago, envio);
		this.pedidos.add(pe);
		return pe;
	}
	
}
