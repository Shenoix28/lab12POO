package controlador;

import modelo.DatosXML;

public class test {

	public static void main(String[] args){
		
		
		String[] usuarios=DatosXML.getElements("UsuariosDAO","UsuarioDAO","nombreUsuario");
		
		System.out.println(usuarios[0]);
		System.out.println(usuarios[1]);
		System.out.println(usuarios[2]);
		
		String[] contrase�as=DatosXML.getElements("UsuariosDAO","UsuarioDAO","contrasenna");

		System.out.println(contrase�as[0]);
		System.out.println(contrase�as[1]);
		System.out.println(contrase�as[2]);
	}

}
