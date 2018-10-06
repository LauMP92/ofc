package com.animales;

public class Gato extends Animal implements Caminante, Respirante  {
	
	public Gato (){
		palabra = "miau";
	}
	
	public Gato (String palabra){
		this.palabra = palabra;
	}

	public void transladarse() {
		
		System.out.println("el gato trepa y camina");
		
	}

	public void respirar() {
		System.out.println("el gato respira");
		
	}
	
	
	
}
