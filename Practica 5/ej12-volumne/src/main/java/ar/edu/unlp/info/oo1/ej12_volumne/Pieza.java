package ar.edu.unlp.info.oo1.ej12_volumne;

public abstract class Pieza {
	private String material, color;
	
	public Pieza(String m, String c) {
		this.material = m.toLowerCase();
		this.color = c;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
	abstract public double getVolumen();
	
	abstract public double getSuperficie();
}
