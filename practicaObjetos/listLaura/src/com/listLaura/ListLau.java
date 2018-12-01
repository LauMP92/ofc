package com.listLaura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListLau {

	public static void main(String[] args) {
	
		List<String> palabras=new ArrayList<>();
		palabras.add("vaso");
		palabras.add("plato");
		palabras.add("tenedor");
		
		
		for (String palabra : palabras) {
			System.out.println(palabra);
			
		}

		for (int i = 0; i < palabras.size(); i++) {
			String palabra = palabras.get(i);
			System.out.println(palabra);
		} 
		
		Collections.reverse(palabras);
		for (String palabra : palabras) {
			System.out.println(palabra);
			
			
		}
		String aux=palabras.get(0);
		palabras.set(0, palabras.get(1));
		palabras.set(1, aux);
		
		
		
	}

}
