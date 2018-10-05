package com.aniales2;

public abstract class Animal {

	protected String palabra;
	private static String TITULO ="el animal dice ";
	
	public void hablar() {
		System.out.println(TITULO +palabra);
		
		
		
	}
	
}
