package ar.edu.unlp.info.oo1.ej15_alquiler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public Reserva reservar(Propiedad p, DateLapse periodo, Usuario inquilino) {
		boolean estaDisponible = p.estaDisponible(periodo);
		
		if(estaDisponible) {
			Reserva r = new Reserva(p, periodo, inquilino);
			p.agregarReserva(r);
			inquilino.agregarReserva(r);
			return r;
		}
		return null;
	}
	
	public double calcularPrecioReserva(Reserva r) {
		return r.calcularPrecio();
	}
	
	public void eliminarReserva(Reserva r) {
		if(r.getPeriodo().getFrom().isAfter(LocalDate.now())) {
			Propiedad p = r.getPropiedad();
			p.eliminarReserva(r);
			r = null;
		}
	}
	
	public List<Reserva> obtenerReservas(Usuario u){
		Usuario user = this.usuarios.stream().filter(us -> us.equals(u)).findFirst().orElse(null);
		
		if(user != null) {
			return user.getReservas();
		}
		
		return null;
	}
	
	public double calcularIngresos(Usuario u, DateLapse intervalo) {
		Usuario user = this.usuarios.stream().filter(us -> us.equals(u)).findFirst().orElse(null);
		
		if(user != null) {
			List<Reserva> reservas = user.getReservas();
			return reservas.stream().filter(r -> r.cumple(intervalo)).mapToDouble(r -> r.calcularPrecio()).sum();
		}
		
		return -1;
	}
	
	public List<Usuario> getUsuarios(){
		return new ArrayList<Usuario>(this.usuarios);
	}
}
