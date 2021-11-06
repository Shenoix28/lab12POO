package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DatosXML {

	private static Document doc;
	private static DocumentBuilder builder;

	public static String[] getElements(String fileName, String objectName, String atributo) {
		File inputFile = new File(fileName + ".xml");
		String[] datos;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(inputFile);
			doc.getDocumentElement().normalize();

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		NodeList usuarios = doc.getElementsByTagName(objectName);
		datos = new String[usuarios.getLength()];
		for (int i = 0; usuarios.getLength() > i; i++) {
			Element usuario = (Element) usuarios.item(i);
			datos[i] = usuario.getElementsByTagName(atributo).item(0).getTextContent();
		}

		return datos;

	}

	public static void writeElements(String fileName, String objectName, String[] atributos, String[] datos) {
		File inputFile = new File(fileName + ".xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		if(atributos.length!=datos.length) {
			System.out.println("Los atributos y los datos no coinciden");
			return;
		}
		
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(inputFile);
			//agrega al objeto
			Element objeto=doc.createElement(objectName); 
			
			for (int i=0; atributos.length>i;i++) {
				Element attr=doc.createElement(atributos[i]);
				attr.setTextContent(datos[i]);
				objeto.appendChild(attr);
			}

			doc.getDocumentElement().appendChild(objeto);
			
			doc.getDocumentElement().normalize();

			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(fileName + ".xml"));

			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();

			transformer.transform(source, result);
			
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException  e) {
			e.printStackTrace();
		}

	}
	
	public static void modifyElement(String fileName, String objectName, String atributoID, String datoID, String atributoCambio , String datoNuevo) {
		File inputFile = new File(fileName + ".xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(inputFile);
			NodeList coleccion=doc.getElementsByTagName(objectName); 
			Node unidad=null;
			for (int i=0;coleccion.getLength()>i;i++) {
				unidad=coleccion.item(i);
				
				NodeList attrobj= unidad.getChildNodes();
								
				String dato=attrobj.item(0).getTextContent();

				if(dato.equals(datoID)) {
					for (int x=0;attrobj.getLength()>x;x++) {
						if (attrobj.item(x).getNodeName().equals(atributoCambio)) {
							attrobj.item(x).setTextContent(datoNuevo);
							break;
						}
					}
					
				}
			}
			
			doc.getDocumentElement().normalize();
			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(fileName + ".xml"));

			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();

			transformer.transform(source, result);
			
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException  e) {
			e.printStackTrace();
		}
		
	}

}
