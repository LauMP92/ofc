package com.objetos;

import java.util.Date;

public class Persona {
	
	
	private float altura;
	private float peso;
	private int edad;
	private Date nacimiento; 
	private String nacionalidad;
	private String razgos;
	private char sexo;
	
	 public Persona(float altura,
	 				float peso,
	 				int edad,
	 				Date nacimiento, 
	 				String nacionalidad,
	 				String razgos,
	 				char sexo) {
		 
		 this.altura = altura;
		 this.peso = peso;
		 this.edad=edad;
		 this.nacimiento =nacimiento;
		 this.razgos=razgos;
		 this.sexo=sexo;
				
		 
	}

	

}
