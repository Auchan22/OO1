package ar.edu.unlp.info.oo1.ej19_mercado;

public class Pedido {
	private Cliente cliente;
	private Producto producto;
	private FormaDePago pago;
	private MecanismoDeEnvio envio;
	
	public Pedido(Cliente c, Producto p, FormaDePago pa, MecanismoDeEnvio e) {
		this.cliente = c;
		this.producto = p;
		this.pago = pa;
		this.envio = e;
	}
}
