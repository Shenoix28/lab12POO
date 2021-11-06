package dao;

import java.util.ArrayList;

import modelo.DatosXML;
import modelo.Sala;
import modelo.Usuario;

public class SalaDAOXML implements SalaDAO {

  public Sala registrarSala(Sala sala) {
  	String[] attr= {"identificador","ubicacion","capacidad"};
		String[] datos= {sala.getIdentificador(),sala.getUbicacion(),sala.getCapacidad()};
		DatosXML.writeElements("SalasDAO", "SalaDAO", attr, datos);
		return sala;
  }

  public ArrayList<Sala> cargarListaSala() {
  	String[] identificador=DatosXML.getElements("SalasDAO", "SalaDAO", "identificador");
		String[] ubicacion=DatosXML.getElements("SalasDAO", "SalaDAO", "ubicacion");
		String[] capacidad=DatosXML.getElements("SalasDAO", "SalaDAO", "capacidad");
		ArrayList<Sala> arrSalas=new ArrayList<Sala>();
		
		for (int i=0;identificador.length>i;i++) {
			Sala newSala=new Sala(identificador[i],ubicacion[i],capacidad[i]);
			arrSalas.add(newSala);	
		}
		
		return arrSalas;
  }

  public boolean cambiarSala(String identificador, String ubicacion, String capacidad) {
		
		DatosXML.modifyElement("SalasDAO", "SalaDAO", "identificador", identificador, "ubicacion",ubicacion);
		DatosXML.modifyElement("SalasDAO", "SalaDAO", "identificador", identificador, "capacidad",capacidad);
		
		return true;
  }

}
