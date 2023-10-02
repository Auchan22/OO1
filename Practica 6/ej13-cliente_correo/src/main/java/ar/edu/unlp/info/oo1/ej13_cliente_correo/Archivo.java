package ar.edu.unlp.info.oo1.ej13_cliente_correo;

public class Archivo {
	private String nombre;
	
	public Archivo(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamaño() {
		return this.nombre.length();
	}
}
