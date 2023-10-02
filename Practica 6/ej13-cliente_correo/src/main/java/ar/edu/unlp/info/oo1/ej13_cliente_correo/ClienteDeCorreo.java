package ar.edu.unlp.info.oo1.ej13_cliente_correo;

import java.util.ArrayList;
import java.util.List;
public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.almacenar(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		Email findEmail = origen.findEmail(email);
		
		if(findEmail !=  null) {
			destino.almacenar(findEmail);
			origen.eliminar(findEmail);
		}
	}
	
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.findEmailByTituloODescripcion(texto)).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamaño()).sum();
	}
	
	public void agregarCarpeta(Carpeta c) {
		this.carpetas.add(c);
	}
}
