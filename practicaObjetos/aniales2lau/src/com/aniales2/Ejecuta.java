package com.aniales2;

public class Ejecuta {

	public static void main(String[] args) {
	
		
		Alimentarse [] alimentar=new Alimentarse[2];
		
		alimentar [0] = new Gato();
		alimentar[1]= new Pato();
		for (int i = 0; i < alimentar.length; i++) {
			alimentar[i].comer();
		}
	}

}
