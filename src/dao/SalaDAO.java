package dao;

import java.util.ArrayList;

import modelo.Sala;

public interface SalaDAO {
  public abstract Sala registrarSala(Sala sala);

  public abstract ArrayList<Sala> cargarListaSala();
  
  public abstract boolean cambiarSala(String identificadir, String ubicacion, String capacidad);

}
