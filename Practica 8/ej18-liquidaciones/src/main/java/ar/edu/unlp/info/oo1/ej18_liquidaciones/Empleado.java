package ar.edu.unlp.info.oo1.ej18_liquidaciones;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNacimiento;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	private LocalDate fechaInicio;
	private List<Recibo> recibos;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNacimiento, boolean tieneConyuge,
			boolean tieneHijos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.tieneConyuge = tieneConyuge;
		this.tieneHijos = tieneHijos;
		this.fechaInicio = LocalDate.now();
		this.recibos = new ArrayList<Recibo>();
		this.contratos = new ArrayList<Contrato>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCUIL() {
		return cuil;
	}
	
	public int getAntiguedad() {
		return this.contratos.stream().mapToInt(c -> c.getDuracion()).sum();
	}
	
	public void cargarHoras(LocalDate fechaInicio, double valor, int horas, LocalDate fechaFin) {
		if(this.tieneContratoVencido()) {
			PorHoras c = new PorHoras(this,valor, horas, fechaFin);
			
			this.contratos.add(c);
		}
	}
	
	public void cargarPlanta(LocalDate fechaInicio, double sueldo, double montoConyuge, double montoHijos) {
		if(this.tieneContratoVencido()) {
			Planta c = new Planta(this,sueldo, montoConyuge, montoHijos);
			
			this.contratos.add(c);
		}
	}
	
	public Contrato getContratoActual() {
		return this.contratos.stream().max((Contrato c1, Contrato c2) -> c1.getFechaInicio().compareTo(c2.getFechaInicio())).orElse(null);
	}
	
	public double getAumento() {
		int antiguedad = this.getAntiguedad();
		if(antiguedad >= 5 && antiguedad < 10) {
			return 0.3;
		}else if(antiguedad >= 10 && antiguedad < 15) {
			return 0.5;
		}else if(antiguedad >= 15 && antiguedad < 20) {
			return 0.7;
		}else if(antiguedad >= 20) {
			return 1;
		}
		
		return 0;
	}

	public boolean isTieneConyuge() {
		return tieneConyuge;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}
	
	public boolean tieneContratoVencido() {
		return this.getContratoActual().estaVencido();
	}
	
	public Recibo generarRecibo() {
		if(!this.tieneContratoVencido()) {
			return new Recibo(this, getContratoActual().getMonto());
		}
		
		return null;
	}
	
	
}
