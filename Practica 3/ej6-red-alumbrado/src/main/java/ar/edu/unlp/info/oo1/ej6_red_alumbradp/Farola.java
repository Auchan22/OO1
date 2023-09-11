package ar.edu.unlp.info.oo1.ej6_red_alumbradp;

import java.util.ArrayList;
import java.util.List;

public class Farola implements FarolaInterface {

	private boolean isApagada;
	private List<Farola> neighbors;
	
	public Farola() {
		this.isApagada = true;
		this.neighbors = new ArrayList<Farola>();
	}
	
	@Override
	public List<Farola> getNeighbors() {
		return this.neighbors;
	}
	
	@Override
	public void pairWithNeighbor(Farola otraFarola) {
		this.neighbors.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	
	@Override
	public void turnOn() {
		if(isApagada) {
			this.isApagada = false;
			for (Farola f : neighbors) {
				f.turnOn();
			}
		}
	}
	
	@Override
	public void turnOff() {
		if(!isApagada) {
			this.isApagada = true;
			for (Farola f : neighbors) {
				f.turnOff();
			}
		}
	}
	
	@Override
	public boolean isOn() {
		return !this.isApagada;
	}
	
}
