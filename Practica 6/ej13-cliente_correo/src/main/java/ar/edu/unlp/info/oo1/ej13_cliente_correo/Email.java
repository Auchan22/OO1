package ar.edu.unlp.info.oo1.ej13_cliente_correo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo, cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String t, String c, ArrayList<Archivo> a) {
		this.titulo = t;
		this.cuerpo = c;
		this.adjuntos = new ArrayList<Archivo>(a);
	}
	
	public Email(String t, String c) {
		this.titulo = t;
		this.cuerpo = c;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public ArrayList<Archivo> adjuntos(){
		return new ArrayList<Archivo>(this.adjuntos);
	}
	
	public int tamaño() {
		int aux = this.titulo.length() + this.cuerpo.length();
		
		int auxAdjuntos = this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
		
		return aux + auxAdjuntos;
	}
}
