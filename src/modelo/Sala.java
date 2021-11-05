package modelo;

/**
 * Clase que simula una sala
 * @author Josseline, Nazaret, Manuel
 *
 */
public class Sala {
  private String identificador;
  private String ubicacion;
  private int capacidad;
  
  /**
   * Método constructor de la clase
   * @param pIdentificador que es el identificador de la sala
   * @param pUbicacion que es la ubicacion de la sala
   * @param pCapacidad que es la capacidad de la sala
   */
  public Sala(String pIdentificador, String pUbicacion, int pCapacidad) {
  identificador=pIdentificador;
  ubicacion=pUbicacion;
  capacidad=pCapacidad;
  }
  
  /**
   * Método para indicar el valor del identificador de la sala
   * @param pIdentificador que es el identificador de la sala
   */
  public void setIdentificador(String pIdentificador) {
  identificador=pIdentificador;
  }
  
  /**
   * Método para obtener el valor del identificador de la sala
   * @return el identificador de la sala
   */
  public String getIdentificador() {
  return identificador;
  }
  
  /**
   * Método para indicar el valor de la ubicación de la sala
   * @param pUbicacion que es la ubicación de la sala
   */
  public void setUbicacion(String pUbicacion) {
  ubicacion=pUbicacion;
  }
  
  /**
   * Método para obtener el valor de la ubicación de la sala
   * @return la ubicación de la sala
   */
  public String getUbicacion() {
  return ubicacion; 
  }
  
  /**
   * Método para indicar el valor de la capacidad de la sala
   * @param pCapacidad que es la capacidad de la sala
   */
  public void setCapacidad(int pCapacidad) {
  capacidad=pCapacidad;
  }
  
  /**
   * Método para obtener el valor de la capacidad de la sala
   * @return la capacidad de la sala
   */
  public int getCapacidad() {
  return capacidad;
  }
}
