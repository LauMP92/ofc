package com.animales;

public abstract class Animal {
	
	protected String palabra;
	
	private static String CADENA = "el animal dice: ";
	
	public void hablar(){
		System.out.println(CADENA + palabra);
	}
	
}
