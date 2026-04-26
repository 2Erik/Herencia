package com.krakedev.herencia.tets;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre padre = new Padre(2, 8);
		padre.ahorrar(500.5);
		padre.imprimir();
		
		System.out.println("-------------------------");
		Hija hija = new Hija(8, 2);
		hija.ahorrar(500.5);
		hija.imprimir();
		
		System.out.println("--------------------------");
		Hijo hijo = new Hijo(2, 8, 14);
		hijo.ahorrar(500.5);
		hijo.imprimir();
		
	}

}
