package com.animales;

public class RunRespirante {

	public static void main(String[] args) {
		Respirante[] respirantes = new Respirante[2];
		respirantes[0] = new Gato();
		respirantes[1] = new Pato();
		
		for (int i = 0; i < respirantes.length; i++) {
			respirantes[i].respirar();
		}
	}

}
