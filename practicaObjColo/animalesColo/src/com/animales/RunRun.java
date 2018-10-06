package com.animales;

public class RunRun {
	public static void main(String[] args) {
		
		Caminante[] caminantes = new Caminante[2];
		
		caminantes[0] = new Pato();
		
		caminantes[1] = new Gato();
		
		for (int i = 0; i < caminantes.length; i++) {
			caminantes[i].transladarse();
		}
		
	}
}
