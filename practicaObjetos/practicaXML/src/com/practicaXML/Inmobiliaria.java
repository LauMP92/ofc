package com.practicaXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Inmobiliaria {

	public static void main(String[] args) {

		try {
			File archivo = new File("resourses/manzana.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			Node manzanaNodo = document.getFirstChild();
			Element manzanaElement = (Element) manzanaNodo; 
			String localidad = manzanaElement.getAttribute("localidad");
			System.out.println("la localidad es " + localidad);
			String provincia = manzanaElement.getAttribute("provincia");
			System.out.println("la provincia es " + provincia);
			NodeList casasRaiz =manzanaElement.getElementsByTagName("casas");
			Node casasNode = casasRaiz.item(0);
			Element casasElement = (Element) casasNode;
			NodeList casaNodes = casasElement.getElementsByTagName("casa");
			for (int i = 0; i < casaNodes.getLength(); i++) {
				Node casaNode = casaNodes.item(i);
				Element casaElement = (Element) casaNode;
				String direccion = casaElement.getAttribute("direccion");
				System.out.println("la direccion " + i + " es " + direccion);
			
			}
			
			//TODO agregar elemento nuevo y inprimirlo.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
