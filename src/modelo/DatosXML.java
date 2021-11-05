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

	public static void writeElements(String fileName, String objectName, String atributo) {
		File inputFile = new File(fileName + ".xml");
		String[] datos;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(inputFile);
			//agrega al objeto
			Element objeto=doc.createElement(objectName);      
			//agrega atributos
			Node data=doc.createTextNode("nombreUsuario");
			data.setNodeValue("numa");
			objeto.appendChild(data);
			
			doc.getDocumentElement().appendChild(objeto);
			

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(fileName + ".xml"));

			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();

			transformer.transform(source, result);
			
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
			e.printStackTrace();
		}

	}

}
