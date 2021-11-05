package dao;
import java.util.ArrayList;

import modelo.Usuario;

public interface UsuarioDAO {
	
  public abstract Usuario iniciarSesion(Usuario usuario);

  public abstract ArrayList<Usuario> cargarListaUsuario();
  
  public abstract boolean cambiarContraseña(String nombreUsuario, String contrasenna, String contrasennaNueva);

  public abstract boolean registrarUsuario(Usuario usuario);
}
