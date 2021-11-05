package modelo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DatosXML {

	private static Document doc;
	private static DocumentBuilder builder;

	public static String[] getElements(String fileName,String objectName, String atributo) {
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
		datos=new String[usuarios.getLength()];
		for (int i = 0; usuarios.getLength() > i; i++) {
			Element usuario = (Element) usuarios.item(i);
			datos[i]=usuario.getElementsByTagName(atributo).item(0).getTextContent();
		}
		
		return datos;

	}
	
	public static void writeElements(String fileName,String objectName, String atributo) {
		
	}

}
