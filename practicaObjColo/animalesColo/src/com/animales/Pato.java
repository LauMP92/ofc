package com.animales;

public class Pato extends Animal implements Caminante, Respirante {

	public Pato() {
		palabra = "cuak";
	}

	public void transladarse() {
		
		System.out.println("el pato da pasos y vuela");
	}

	public void respirar() {
		System.out.println("el pato respira");
		
	}
	
}
