package dao;

import java.util.ArrayList;

import modelo.Sala;
/**
 * Interface de SalaDao
 * @author nazaret, josseline, manuel
 *
 */
public interface SalaDAO {
  public abstract Sala registrarSala(Sala sala);

  public abstract ArrayList<Sala> cargarListaSala();
  
  public abstract boolean cambiarSala(String identificadir, String ubicacion, String capacidad);

}
