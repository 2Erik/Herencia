package com.krakedev.herencia;

//Para la herencia se utiliza la palabra reservada extends
public class Hija extends Padre {
	
	//COSTRUCTOR
	
	public Hija (int defectos, int virtudes, String nombre) {
		super(defectos, virtudes, nombre);
	}

	// METODO PROPIO DE LA HIJA

	public void escuchaRock() {
		System.out.println("La mejor musica");
	}

	// ToString
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"\nDefectos: " + getDefectos() + "\nVirtudes: " + getVirtudes()
		+"\nTotal Ahorrado: "+getTotalAhorrado();
	}

}
