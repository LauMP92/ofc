package com.aniales2;

public class Gato extends Animal implements Caminante, Alimentarse {
	
	public Gato() {
		
		palabra="miau";
		
	}

	public void transladarse() {
		
		
		System.out.println("el gato trepa y camina");
		
		
		
	}
	
	public void comer() {
		
		System.out.println("elgato esta comiendo");
	}

}
