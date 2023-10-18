package ar.edu.unlp.info.oo1.ej17_facturacion;

public class Juridica extends Persona {
	private String cuit;
	private String tipo;
	
	public Juridica(String nombre, String direccion, String numero, String cuit, String tipo) {
		super(nombre, direccion, numero);
		this.cuit = cuit;
		this.tipo = tipo;
	}

	public String getCuit() {
		return cuit;
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
