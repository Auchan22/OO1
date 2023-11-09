package ar.edu.unlp.info.oo1.parcial2018;

public class Tarifario {
	private double precioResidencial;
	private double precioIndustria;
	
	public Tarifario(double r, double i) {
		this.precioIndustria = i;
		this.precioResidencial = r; 
	}

	public double getPrecioResidencial() {
		return precioResidencial;
	}

	public void setPrecioResidencial(double precioResidencial) {
		this.precioResidencial = precioResidencial;
	}

	public double getPrecioIndustria() {
		return precioIndustria;
	}

	public void setPrecioIndustria(double precioIndustria) {
		this.precioIndustria = precioIndustria;
	}
	
	
}
