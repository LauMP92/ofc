package com.objetos;

import java.util.Date;

public class Perro {

	private float altura;
	private float peso;
	private int edadAprox;
	private Date nacimiento; 
	private String razgos;
	private char sexo;
	private String color;
	private String raza;
	
	
	public Perro(float altura, float peso, int edadAprox, Date nacimiento, String razgos, char sexo, String color,
			String raza) {
		
		this.altura = altura;
		this.peso = peso;
		this.edadAprox = edadAprox;
		this.nacimiento = nacimiento;
		this.razgos = razgos;
		this.sexo = sexo;
		this.color = color;
		this.raza = raza;
	}
	
	
}
