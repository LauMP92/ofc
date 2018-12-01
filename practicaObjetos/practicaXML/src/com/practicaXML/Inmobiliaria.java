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
			
			imprimirAtributoDeNode(manzanaNodo, "localidad");
			imprimirAtributoDeNode(manzanaNodo, "provincia");
			
			imprimirNodosHijos(manzanaElement,"callesCircundantes","calleCircundante");
			imprimirNodosHijos(manzanaElement,"servicios","servicio");
			imprimirCasas(manzanaElement);
			
			//TODO agregar elemento nuevo y inprimirlo.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void imprimirCasas(Element manzanaElement) {
		NodeList casas = manzanaElement.getElementsByTagName("casas");
		Node casasNode = casas.item(0);
		Element casasElement = (Element) casasNode;
		NodeList casaNodes = casasElement.getElementsByTagName("casa");
		for (int i = 0; i < casaNodes.getLength(); i++) {
			Node casaNode = casaNodes.item(i);
			System.out.println("-------------------- ");
			System.out.println("la direccion " + i );
			imprimirAtributoDeNode(casaNode, "direccion");
			imprimirAtributoDeNode(casaNode, "diametroTerreno");
			imprimirAtributoDeNode(casaNode, "entrada");
			imprimirAtributoDeNode(casaNode, "hambientes");
			System.out.println("-------------------- ");
		
		}
	}

	private static void imprimirNodosHijos(Element rootElement, String nodoPadreName,String nodoHijoName) {
		NodeList nodosPadre = rootElement.getElementsByTagName( nodoPadreName);
		Node nodoPadre = nodosPadre.item(0);
		Element padreElement = (Element) nodoPadre;
		NodeList padreNodes = padreElement.getElementsByTagName(nodoHijoName);
		for (int i = 0; i < padreNodes.getLength(); i++) {
			Node hijoNode = padreNodes.item(i);
			System.out.println("-------------------- ");
			System.out.println("el valor del nodo " + nodoHijoName +i  + " es " + hijoNode.getTextContent());
			System.out.println("-------------------- ");
		
		}
	}
	
	private static void imprimirAtributoDeNode(Node node, String attrName) {
		Element element = (Element) node;
		String value = element .getAttribute(attrName);
		System.out.println("el attributo " + attrName + " es " + value);
	}

}
