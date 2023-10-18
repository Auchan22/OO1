package ar.edu.unlp.info.oo1.ej17_facturacion;

public class Fisica extends Persona {
	private String dni;
	
	public Fisica(String nombre, String direccion, String numero, String dni) {
		super(nombre, direccion, numero);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}
}
