package ar.edu.unlp.info.oo1.ej19_mercado;

public class Pedido {
	private Cliente cliente;
	private Producto producto;
	private FormaDePago pago;
	private MecanismoDeEnvio envio;
	private int cantidades;
	
	public Pedido(Cliente c, Producto p, int cant, FormaDePago pa, MecanismoDeEnvio e) {
		this.cliente = c;
		this.producto = p;
		this.pago = pa;
		this.envio = e;
		this.cantidades = cant;
	}
	
	private String getDireccionPersona(Persona p) {
		return p.getDireccion();
	}
	
	public double getCostoTotal() {
		double total = (this.cantidades * this.producto.getPrecio());
		
		return total + this.pago.calcularPago(total) + this.envio.calcularEnvio(this.getDireccionPersona(this.producto.getVendedor()), this.getDireccionPersona(cliente));
	}
}
