package controlador;

import vista.*;
import modelo.*;

/**
 * Clase main para ejecutar el programa.
 * @author Josseline, Nazaret, Manuel
 *
 */
public class gestorSalas {

	/**
	 * Metodo principal para ejecutar las 2 vistas creadas para el laboratorio:
	 * 	-LoginForm
	 * 	-RegistrarSala
	 * 
	 * @param args
	 */
	public static void main(String[]args) {
	  LoginForm vistaLogin=new LoginForm();
	  Usuario usuario=new Usuario();
	  
	  RegistrarSala vistaSala=new RegistrarSala();
	  Sala sala=new Sala();
	  
	  ControladorUsuario controladorUsuario=new ControladorUsuario(vistaLogin, usuario);
	  controladorUsuario.vista.setVisible(true);
	  controladorUsuario.vista.setLocationRelativeTo(null);
	  
	  ControladorSala controladorsala=new ControladorSala(vistaSala, sala);
	  controladorsala.vista.setVisible(true);
	  controladorsala.vista.setLocationRelativeTo(null);
	}
}
