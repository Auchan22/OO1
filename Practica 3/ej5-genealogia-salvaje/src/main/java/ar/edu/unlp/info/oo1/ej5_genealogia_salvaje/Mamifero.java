package ar.edu.unlp.info.oo1.ej5_genealogia_salvaje;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre, madre;
	
	public Mamifero() {};
	
	public Mamifero(String i) {
		this.identificador = i;
		this.madre = new Mamifero();
		this.madre = null;
		this.padre = new Mamifero();
		this.padre = null;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean aux = false;
		
		if(this.madre == unMamifero || this.padre == unMamifero){
			aux = true;
		}else {
			if(this.padre != null) aux = this.getPadre().tieneComoAncestroA(unMamifero);
			if((this.madre != null) && (!aux)) aux = this.getMadre().tieneComoAncestroA(unMamifero);
		}
		
		return aux;
	}
	
}
