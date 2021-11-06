package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class RegistrarSala extends JFrame {

  private JPanel contentPane;
  public JTextField txtIdentificador;
  public JTextField txtUbicacion;
  public JTextField txtCapacidad;
  public JButton btnCrearSala;

  /**
   * Create the frame.
   */
  public RegistrarSala() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 102, 102));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblIdentificador = new JLabel("Identificador:");
    lblIdentificador.setForeground(new Color(255, 255, 255));
    lblIdentificador.setFont(new Font("SansSerif", Font.PLAIN, 17));
    lblIdentificador.setBounds(63, 74, 129, 14);
    contentPane.add(lblIdentificador);
    
    JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
    lblUbicacion.setForeground(new Color(255, 255, 255));
    lblUbicacion.setFont(new Font("SansSerif", Font.PLAIN, 17));
    lblUbicacion.setBounds(63, 113, 129, 14);
    contentPane.add(lblUbicacion);
    
    JLabel lblCapacidad = new JLabel("Capacidad:");
    lblCapacidad.setForeground(new Color(255, 255, 255));
    lblCapacidad.setFont(new Font("SansSerif", Font.PLAIN, 17));
    lblCapacidad.setBounds(63, 154, 129, 20);
    contentPane.add(lblCapacidad);
    
    txtIdentificador = new JTextField();
    txtIdentificador.setFont(new Font("SansSerif", Font.PLAIN, 15));
    txtIdentificador.setBounds(202, 72, 165, 20);
    contentPane.add(txtIdentificador);
    txtIdentificador.setColumns(10);
    
    txtUbicacion = new JTextField();
    txtUbicacion.setFont(new Font("SansSerif", Font.PLAIN, 15));
    txtUbicacion.setBounds(202, 111, 165, 20);
    contentPane.add(txtUbicacion);
    txtUbicacion.setColumns(10);
    
    txtCapacidad = new JTextField();
    txtCapacidad.setFont(new Font("SansSerif", Font.PLAIN, 15));
    txtCapacidad.setBounds(202, 152, 165, 20);
    contentPane.add(txtCapacidad);
    txtCapacidad.setColumns(10);
    
    btnCrearSala = new JButton("Crear Sala");
    btnCrearSala.setFont(new Font("SansSerif", Font.PLAIN, 15));
    btnCrearSala.setBounds(158, 206, 120, 23);
    contentPane.add(btnCrearSala);
  }
  public boolean registroDatosCorrectos() {
    return true;
  }
  
}
