package ar.edu.unlp.info.oo1.ej15_alquiler;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva(Propiedad p, DateLapse pe, Usuario u) {
		this.propiedad = p;
		this.periodo = pe;
		this.inquilino = u;
	}
	
	public boolean cumple(DateLapse intervalo) {
		return this.periodo.overlaps(intervalo);
	}
	
	public double calcularPrecio() {
		return this.propiedad.getPrecioNoche() * this.periodo.sizeInDays();
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
}
