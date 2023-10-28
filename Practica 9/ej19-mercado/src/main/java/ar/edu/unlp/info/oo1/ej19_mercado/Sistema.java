package ar.edu.unlp.info.oo1.ej19_mercado;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Vendedor> vendedores;
	private List<Cliente> clientes;
	
	public Sistema() {
		this.clientes = new ArrayList<Cliente>();
		this.vendedores = new ArrayList<Vendedor>();
	}
}
