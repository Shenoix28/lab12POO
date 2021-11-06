package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.SalaDAO;
import dao.SalaDAOXML; 
import modelo.Sala;
import vista.RegistrarSala;

public class ControladorSala implements ActionListener {
  public RegistrarSala vista;
  public SalaDAO daoSala;
  public Sala sala;
  
  public ControladorSala(RegistrarSala pVista, Sala pSala) {
    vista = pVista;
    sala = pSala;
    daoSala = new SalaDAOXML();

    this.vista.btnCrearSala.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
    case "Crear Sala":
      registrarSala();
      break;
    default:
      break;
    }
  }

  public void registrarSala() {
    if (vista.registroDatosCorrectos() == true) {
      String identificador = vista.txtIdentificador.getText();
      String ubicacion = vista.txtUbicacion.getText();
      String capacidad = vista.txtCapacidad.getText();
      

      sala = new Sala(identificador, ubicacion, capacidad );
      Sala salaActual = daoSala.registrarSala(sala);

      if (salaActual != null) {
        vista.setVisible(false);
        JOptionPane.showMessageDialog(vista, "Sala Creada");
        vista.setVisible(true);
      } else {
        JOptionPane.showMessageDialog(vista, "La sala no creada");
      }
    } else {
      JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }

}
