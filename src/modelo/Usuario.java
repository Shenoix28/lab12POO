package modelo;

/**
 * Clase que simula un usuario
 * @author Josseline, Nazaret, Manuel
 *
 */
public class Usuario {
  private String nombre;
  private String contrasenna;
 
  /**
   * Método constructor de la clase
   * @param pNombre que es el nombre del usuario
   * @param pContrasenna que es la contraseña del usuario
   */
  public Usuario(String pNombre, String pContrasenna) {
  nombre=pNombre;
  contrasenna=pContrasenna;
  }
  
  public Usuario() {
	}

	/**
   * Método para indicar el nombre del usuario
   * @param pNombre que es el nombre del usuario
   */
  public void setNombre(String pNombre) {
  nombre=pNombre;
  }
  
  /**
   * Método para obtener el valor del nombre del usuario
   * @return el nombre del usuario
   */
  public String getNombre() {
  return nombre;
  }
  
  /**
   * Método para indicar el valor de la contraseña del usuario  
   * @param pContrasenna que es la contraseña del usuario
   */
  public void setContrasenna(String pContrasenna) {
  contrasenna=pContrasenna;
  }
  
  /**
   * Método para obtener el valor de la contraseña del usuario
   * @return la contraseña del usuario
   */
  public String getContrasenna() {
  return contrasenna;
  }
}
