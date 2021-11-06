package dao;
import java.util.ArrayList;

import modelo.Usuario;
/**
 * Interface de UsuarioDAO
 * @author nazaret, manuel, josseline
 *
 */
public interface UsuarioDAO {
	
  public abstract Usuario iniciarSesion(Usuario usuario);

  public abstract ArrayList<Usuario> cargarListaUsuario();
  
  public abstract boolean cambiarContrase�a(String nombreUsuario, String contrasenna, String contrasennaNueva);

  public abstract boolean registrarUsuario(Usuario usuario);
}
