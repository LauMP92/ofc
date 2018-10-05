package com.aniales2;

public class Run {

	public static void main(String[] args) {
		
		Animal animal;
		
		
		animal=new Pato();
		animal.hablar();
		
		
		
		animal=new Perro();
		animal.hablar();

		
		animal=new Gato();
		animal.hablar();
	}

}
