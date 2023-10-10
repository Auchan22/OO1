package ar.edu.unlp.info.oo1.ej15_alquiler;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> usuarios;
	
	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni){
		Usuario newUser = new Usuario(nombre, direccion, dni);
		this.usuarios.add(newUser);
		
		return newUser;
	}
	
	public Propiedad registarPropiedad(String nombre, String descripcion, double precio, String direccion, Usuario propietario) {
		Propiedad newProp = new Propiedad(nombre, descripcion, direccion, precio, propietario);
		propietario.agregarPropiedad(newProp);
		
		return newProp;
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse intervalo){
		ArrayList<Propiedad> disponibles = new ArrayList<Propiedad>();
		
		for(Usuario u : this.usuarios) {
			disponibles.addAll(u.propiedadesDisponibles(intervalo));
		}
		
		return disponibles;
	}
}
