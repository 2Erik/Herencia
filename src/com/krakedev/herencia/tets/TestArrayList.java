package com.krakedev.herencia.tets;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Hija> listaHijas = new ArrayList<Hija>();
		
		Hija hija1 = new Hija(1, 5);
		hija1.setDefectos(1);
		hija1.setVirtudes(5);
		
		listaHijas.add(hija1);
		
		Hija hija2 = new Hija(2, 6);
		hija2.setDefectos(6);
		hija2.setVirtudes(2);
		
		listaHijas.add(hija2);
		
		Hija hija3 = new Hija(3, 8);
		hija3.setDefectos(6);
		hija3.setVirtudes(2);
		
		listaHijas.add(hija3);
		
		System.out.println(listaHijas);
	}

}
