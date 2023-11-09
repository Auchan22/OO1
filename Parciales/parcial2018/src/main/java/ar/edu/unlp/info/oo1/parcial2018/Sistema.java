package ar.edu.unlp.info.oo1.parcial2018;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Cliente> clientes;
	private List<Medicion> mediciones;
	private Tarifario tarifario;
	
	public Sistema(double valorResidencial, double valorIndustria) {
		this.clientes = new ArrayList<Cliente>();
		this.mediciones = new ArrayList<Medicion>();
		this.tarifario = new Tarifario(valorResidencial, valorIndustria);
	}
}
