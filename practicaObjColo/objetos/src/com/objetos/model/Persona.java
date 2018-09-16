package com.objetos.model;

import java.util.Date;

public class Persona {

	private float altura;
	private float peso;
	private String sexo;
	private String rasgos;
	private int edad;
	private Date nacimiento;
	
	public Persona( float altura,float peso,String sexo,String rasgos,int edad,Date nacimiento){
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.rasgos = rasgos;
		this.edad = edad;
		this.nacimiento = nacimiento;
		
		
	}
}
