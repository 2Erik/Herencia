package com.krakedev.herencia;

public class Padre {
	private String nombre;
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	
	//CONSTRUCTOR
//	public Padre() {
//		System.out.println("Soy el constructor vacio del Padre");
//	}
	
	public Padre(int defectos, int virtudes, String nombre) {
		this.defectos = defectos;
		this.virtudes = virtudes;
		this.nombre = nombre;
	}
	
	//GETTERS AND SETTERS
	public int getDefectos() {
		return defectos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public double getTotalAhorrado() {
		return totalAhorrado;
	}
	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	//////////////////////////////////
	/// METODOS
	/////////////////////////////////
	
	//METODO IMPRIMIR
	public void imprimir() {
		System.out.println("Virtudes: "+virtudes);
		System.out.println("Defectos: "+defectos);
		System.out.println("Ahorro: "+totalAhorrado);
	}
	
	//METODO PRIVADO
	//Los metodos privados no se heredan
	public void guardarSecreto() {
		System.out.println("Esto es un secreto");
	}
	
	//METODO AHORRAR
	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}
	
	//METODO toString
	@Override
	public String toString() {
		return "Nombre=" + nombre + "\nDefectos=" + defectos + "\nVirtudes=" + virtudes + "\nTotal Ahorrado="
				+ totalAhorrado;
	}
	
	
}
