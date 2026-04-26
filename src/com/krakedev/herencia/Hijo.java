package com.krakedev.herencia;

public class Hijo extends Padre{
	private int juguetes;
	
	//CONSTRUCTOR
	public Hijo(int defectos, int virtudes, int juguetes) {
		super(defectos, virtudes);
		this.juguetes = juguetes;
	}
	
	//METODO toString
	@Override
	public String toString() {
		return "Defectos: " + getDefectos() + " Virtudes: " + getVirtudes()+" Juguetes: "+juguetes;
	}
	
	
}
