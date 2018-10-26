package com.listadelamuerte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasTest {

	public static void main(String[] args) {
		
		List<String> palabras = new ArrayList<>();
		palabras.add("racing");
		palabras.add("club");
		palabras.add("de avellaneda");
		
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
	}

}
