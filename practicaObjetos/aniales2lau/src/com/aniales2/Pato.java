package com.aniales2;

public class Pato extends Animal implements Caminante,Alimentarse{
	
	public Pato() {
		palabra = "cuak";
	}

	public void transladarse() {
		
		
		System.out.println("el pato da pasos y vuela");
		
		
		
	}public void comer() {
		
		System.out.println("el pato esta comiendo");
	}

	
	

}
