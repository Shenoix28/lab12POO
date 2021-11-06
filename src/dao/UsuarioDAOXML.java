package dao;

import java.util.ArrayList;

import modelo.DatosXML;
import modelo.Usuario;

public class UsuarioDAOXML implements UsuarioDAO{

	public Usuario iniciarSesion(Usuario usuario) {
		String[] usuarios=DatosXML.getElements("UsuariosDAO", "UsuarioDAO", "nombreUsuario");
		String[] contrasennas=DatosXML.getElements("UsuariosDAO", "UsuarioDAO", "contrasenna");
		
		for (int i=0;usuarios.length>i;i++) {
			if (usuarios[i].equals(usuario.getNombre())) {
				if(contrasennas[i].equals(usuario.getContrasenna())){
					return usuario;
				}
			}
		}
		
		return null;
	}

	public ArrayList<Usuario> cargarListaUsuario() {
		
		String[] usuarios=DatosXML.getElements("UsuariosDAO", "UsuarioDAO", "nombreUsuario");
		String[] contrasennas=DatosXML.getElements("UsuariosDAO", "UsuarioDAO", "contrasenna");
		ArrayList<Usuario> arrUsuarios=new ArrayList<Usuario>();
		
		for (int i=0;usuarios.length>i;i++) {
			Usuario newUsuario=new Usuario(usuarios[i],contrasennas[i]);
			arrUsuarios.add(newUsuario);	
		}
		
		return arrUsuarios;
	}

	public boolean cambiarContraseña(String nombreUsuario, String contrasenna, String contrasennaNueva) {
		
		if (iniciarSesion(new Usuario(nombreUsuario,contrasenna))==null) {
			return false;
		}
		
		DatosXML.modifyElement("UsuariosDAO", "UsuarioDAO", "nombreUsuario", nombreUsuario, "contrasenna",contrasennaNueva);

		return true;
	}

	public boolean registrarUsuario(Usuario usuario) {
		String[] attr= {"nombreUsuario","contrasenna"};
		String[] datos= {usuario.getNombre(),usuario.getContrasenna()};
		DatosXML.writeElements("UsuariosDAO", "UsuarioDAO", attr, datos);
		
		
		return true;
	}

}
