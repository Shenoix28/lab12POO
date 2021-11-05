package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginForm extends JFrame {

	public JPanel contentPane;
	public JTextField txtNombreUsuario;
	public JTextField txtContraseña;
	public JButton btnCancelarLogin;
	public JButton btnIniciarLogin;


	/**
	 * Create the frame.
	 */
	public LoginForm() {
	  setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreUsuario = new JLabel("Usuario:");
		lblNombreUsuario.setForeground(new Color(255, 255, 255));
		lblNombreUsuario.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblNombreUsuario.setBounds(61, 71, 100, 14);
		contentPane.add(lblNombreUsuario);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setForeground(new Color(255, 255, 255));
		lblContraseña.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblContraseña.setBounds(61, 129, 100, 14);
		contentPane.add(lblContraseña);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtNombreUsuario.setBounds(204, 69, 162, 20);
		contentPane.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtContraseña.setBounds(204, 127, 162, 20);
		contentPane.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		btnCancelarLogin = new JButton("Cancelar logIn");
		btnCancelarLogin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnCancelarLogin.setBounds(61, 206, 140, 23);
		contentPane.add(btnCancelarLogin);
		
		btnIniciarLogin = new JButton("Iniciar logIn");
		btnIniciarLogin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnIniciarLogin.setBounds(226, 206, 140, 23);
		contentPane.add(btnIniciarLogin);	
	}
	public boolean logInDatosCorrectos() {
	  return true;
	}
	public void abrirVentanaAnterior(LoginForm ventanaAnterior) {
	  ventanaAnterior.setVisible(true);
	}
	public void cancelarInicioSecion() {
		System.out.println("SALIENDO....");
	  System.exit(0);
	}
}