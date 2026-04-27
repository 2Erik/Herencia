package com.krakedev.herencia;

public class Hijo extends Padre{
	private int juguetes;
	
	//CONSTRUCTOR
	public Hijo(int defectos, int virtudes, String nombre, int juguetes) {
		super(defectos, virtudes, nombre);
		this.juguetes = juguetes;
	}
	
	//METODO toString
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"\nDefectos: " + getDefectos() + "\nVirtudes: " + getVirtudes()+"\nJuguetes: "+juguetes
				+"\nTotal Ahorrado: "+getTotalAhorrado();
	}
	
	@Override
	public void ahorrar(double monto) {
		setTotalAhorrado((monto*0.5) + getTotalAhorrado());
	}
	
	
}
