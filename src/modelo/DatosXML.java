package modelo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DatosXML {

	private static Document doc;
	private static DocumentBuilder builder;

	public static void getElements() {
		File inputFile = new File("UsuariosDAO.xml");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(inputFile);

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		NodeList usuarios=doc.getElementsByTagName("UsuarioDAO");
		for (int i=0;usuarios.getLength()>i;i++) {
			System.out.println(usuarios.item(i));
		}

	}

}
