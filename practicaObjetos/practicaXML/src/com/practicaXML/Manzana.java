package com.practicaXML;

import java.util.List;

public class Manzana {
	
	private String localidad;
	private List<String> callesCircundantes;
	private List<String> servicios;
	private List<String> casas;
	
	public Manzana(int manzana,String localidad,List<String> callesCircundantes,List<String> servicios, List<String> casas) {
	    this.localidad=localidad;
		this.callesCircundantes=callesCircundantes;
	    this.servicios=servicios;
	    this.casas=casas;
	}

	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public List<String> getCallesCircundantes() {
		return callesCircundantes;
	}


	public void setCallesCircundantes(List<String> callesCircundantes) {
		this.callesCircundantes = callesCircundantes;
	}

	public List<String> getServicios() {
		return servicios;
	}


	public void setServicios(List<String> servicios) {
		this.servicios = servicios;
	}

	public List<String> getCasas() {
		return casas;
	}

	public void setCasas(List<String> casas) {
		this.casas = casas;
	}
	
	

}
