package dao;

import java.util.ArrayList;

import modelo.DatosXML;
import modelo.Usuario;
/**
 * Clase UsuarioDAOXML que implementa la clase abstracta UsuarioDAO 
 * @author nazaret, manuel, josseline
 *
 */
public class UsuarioDAOXML implements UsuarioDAO{
	/**
	 * Metodo que inicia sesion
	 * @param usuario: objeto de tipo Usuario
	 * @return usuario que inicio sesion
	 */
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
    /**
     * Metodo que muestra una lista de los usuarios
     * @return arrUsuarios: Array con los usuario registrados
     */
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
	/**
	 * Metodo que cambia la contraseña de un usuario
	 * @param nombreUsuario: nombre del usuario, contrasenna: contrasenna actual, contrasennaNueva: nueva contrasenna 
	 * @return boolean
	 */
	public boolean cambiarContraseña(String nombreUsuario, String contrasenna, String contrasennaNueva) {
		
		if (iniciarSesion(new Usuario(nombreUsuario,contrasenna))==null) {
			return false;
		}
		
		DatosXML.modifyElement("UsuariosDAO", "UsuarioDAO", "nombreUsuario", nombreUsuario, "contrasenna",contrasennaNueva);

		return true;
	}
	/**
	 * Metodo que registra a un usuario
	 * @param Usuario: objeto de tipo usuario
	 * @return boolean
	 */
	public boolean registrarUsuario(Usuario usuario) {
		String[] attr= {"nombreUsuario","contrasenna"};
		String[] datos= {usuario.getNombre(),usuario.getContrasenna()};
		DatosXML.writeElements("UsuariosDAO", "UsuarioDAO", attr, datos);
		
		
		return true;
	}

}
