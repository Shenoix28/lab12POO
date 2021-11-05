package controlador;

import vista.*;
import modelo.*;

public class gestorSalas {

	public static void main(String[]args) {
	  LoginForm vista=new LoginForm();
	  Usuario usuario=new Usuario("ssdm","ddd");
	  
	  ControladorUsuario controladorUsuario=new ControladorUsuario(vista, usuario);
	  controladorUsuario.vista.setVisible(true);
	  controladorUsuario.vista.setLocationRelativeTo(null);
	}
}
