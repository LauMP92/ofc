package com.practicaXML;

public class casa {

	private float diametroTerreno;
	private int entradas;
	private String direccion;
	
	private int cantidadHambientes;

	public casa(float diametroTerreno, int entradas, String direccion, int cantidadHambientes) {

		this.diametroTerreno = diametroTerreno;
		this.entradas = entradas;
		this.direccion = direccion;
		
		this.cantidadHambientes = cantidadHambientes;
	}

	public float getDiametroTerreno() {
		return diametroTerreno;
	}

	public void setDiametroTerreno(float diametroTerreno) {
		this.diametroTerreno = diametroTerreno;
	}

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

	public int getCantidadHambientes() {
		return cantidadHambientes;
	}

	public void setCantidadHambientes(int cantidadHambientes) {
		this.cantidadHambientes = cantidadHambientes;
	}

}
