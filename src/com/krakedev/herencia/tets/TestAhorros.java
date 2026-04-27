package com.krakedev.herencia.tets;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----PADRE-----");
		Padre padre = new Padre(2, 8, "Juan");
		padre.ahorrar(500.5);
		System.out.println(padre);
		
		System.out.println("-----HIJA-----");
		Hija hija = new Hija(8, 2, "Maria");
		hija.ahorrar(500.5);
		System.out.println(hija);
		
		System.out.println("-----HIJO-----");
		Hijo hijo = new Hijo(1, 8, "Pepe", 12);
		hijo.ahorrar(500.5);
		System.out.println(hijo);
		
	}

}
