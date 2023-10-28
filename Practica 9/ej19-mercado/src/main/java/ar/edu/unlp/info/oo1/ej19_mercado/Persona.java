package ar.edu.unlp.info.oo1.ej19_mercado;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	private String nombre;
	private String direccion;
	
	public Persona(String n, String d) {
		this.nombre = n;
		this.direccion = d;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}

}
