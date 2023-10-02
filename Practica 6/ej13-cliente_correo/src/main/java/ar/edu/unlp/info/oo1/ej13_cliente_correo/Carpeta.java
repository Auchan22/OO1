package ar.edu.unlp.info.oo1.ej13_cliente_correo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String n) {
		this.nombre = n;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void almacenar(Email email) {
		this.emails.add(email);
	}
	
	public void eliminar(Email email) {
		int indexFind = this.emails.indexOf(email);
		
		if(indexFind > -1) {
			this.emails.remove(indexFind);
		}
	}
	
	public Email findEmail(Email email) {
		return this.emails.stream().filter(e-> e.equals(email)).findFirst().orElse(null);
	}
	
	public Email findEmailByTituloODescripcion(String t) {
		return this.emails.stream().filter(e-> (e.getCuerpo().equals(t) || e.getTitulo().equals(t))).findFirst().orElse(null);
	}
	
	public int tamaño() {
		return this.emails.stream().mapToInt(e-> e.tamaño()).sum();
	}
}
