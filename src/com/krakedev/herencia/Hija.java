package com.krakedev.herencia;

//Para la herencia se utiliza la palabra reservada extends
public class Hija extends Padre {
	
	//COSTRUCTOR
	
	public Hija (int defectos, int virtudes) {
		super(defectos, virtudes);
	}

	// METODO PROPIO DE LA HIJA

	public void escuchaRock() {
		System.out.println("La mejor musica");
	}

	// ToString
	@Override
	public String toString() {
		return "Defectos: " + getDefectos() + " Virtudes: " + getVirtudes();
	}

}
