package com.krakedev.herencia.tets;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hija = new Hija(7,8, "Maria");
		
		//La clase hija no tiene ningun atrubuto pero
		//hereda todo los atrubutos de la clase padre
		
		hija.setDefectos(2);//Atributo del Padre
		hija.setVirtudes(15);
		
		hija.imprimir();
	}

}
