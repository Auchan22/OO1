package ar.edu.unlp.info.oo1.ej6_red_alumbradp;

import java.util.List;

public interface FarolaInterface {
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola );
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors ();


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn();

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff();
	
	/*
	* Retorna si la farola esta prendida, o no.
	*/
	public boolean isOn();

}
