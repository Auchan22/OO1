package ar.edu.unlp.info.oo1.ej17_facturacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	protected String nombre;
	protected String direccion;
	protected String numeroTelefono;
	protected List<Llamada> llamadas;
	
	public Persona(String nombre, String direccion, String numero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTelefono = numero;
		this.llamadas = new ArrayList<Llamada>();
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getMonto(LocalDate inicio, LocalDate fin) {
		double monto = this.llamadas.stream().filter(l -> esta(inicio, fin, l.getFecha().toLocalDate())).mapToDouble(l -> l.getCosto()).sum();
		return monto;
	}
	
	public Llamada registrarLocal(LocalDateTime fecha, int duracion, String destino) {
		Local l = new Local(fecha, duracion, this.numeroTelefono, destino);
		this.llamadas.add(l);
		return l;
	}
	
	public Llamada registrarInterurbana(LocalDateTime fecha, int duracion, String destino, int distancia) {
		Interurbana l = new Interurbana(fecha, duracion, this.numeroTelefono, destino, distancia);
		this.llamadas.add(l);
		return l;
	}

	public Llamada registrarInternacional(LocalDateTime fecha, int duracion, String destino, String pOrigen, String pDestino) {
		Internacional l = new Internacional(fecha, duracion, this.numeroTelefono, destino, pOrigen, pDestino);
		this.llamadas.add(l);
		return l;
	}
	
	private boolean esta(LocalDate inicio, LocalDate fin, LocalDate f) {
		return ((f.isAfter(inicio) || f.isEqual(inicio)) && (f.isBefore(fin) || f.isEqual(fin)));
	}
	
}
