package modelo;

/**
 * Clase que simula una sala
 * @author Josseline, Nazaret, Manuel
 *
 */
public class Sala {
  private String identificador;
  private String ubicacion;
  private String capacidad;
  
  /**
   * M?todo constructor de la clase
   * @param pIdentificador que es el identificador de la sala
   * @param pUbicacion que es la ubicacion de la sala
   * @param pCapacidad que es la capacidad de la sala
   */
  public Sala(String pIdentificador, String pUbicacion, String pCapacidad) {
  identificador=pIdentificador;
  ubicacion=pUbicacion;
  capacidad=pCapacidad;
  }
  
  public Sala() {
	}

	/**
   * M?todo para indicar el valor del identificador de la sala
   * @param pIdentificador que es el identificador de la sala
   */
  public void setIdentificador(String pIdentificador) {
  identificador=pIdentificador;
  }
  
  /**
   * M?todo para obtener el valor del identificador de la sala
   * @return el identificador de la sala
   */
  public String getIdentificador() {
  return identificador;
  }
  
  /**
   * M?todo para indicar el valor de la ubicaci?n de la sala
   * @param pUbicacion que es la ubicaci?n de la sala
   */
  public void setUbicacion(String pUbicacion) {
  ubicacion=pUbicacion;
  }
  
  /**
   * M?todo para obtener el valor de la ubicaci?n de la sala
   * @return la ubicaci?n de la sala
   */
  public String getUbicacion() {
  return ubicacion; 
  }
  
  /**
   * M?todo para indicar el valor de la capacidad de la sala
   * @param pCapacidad que es la capacidad de la sala
   */
  public void setCapacidad(String pCapacidad) {
  capacidad=pCapacidad;
  }
  
  /**
   * M?todo para obtener el valor de la capacidad de la sala
   * @return la capacidad de la sala
   */
  public String getCapacidad() {
  return capacidad;
  }
}
