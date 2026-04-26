package com.krakedev.herencia.tets;

import com.krakedev.herencia.Padre;

public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre padre = new Padre(8, 12);
		
		//Se imprime directante el toString
		//Esto se hereda de object el padre de todas las clases
		System.out.println(padre);
	}

}
