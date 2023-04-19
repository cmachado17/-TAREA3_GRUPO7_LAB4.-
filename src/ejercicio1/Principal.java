package ejercicio1;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String dni = JOptionPane.showInputDialog("Ingrese su dni: ");
	    Dni.verificarDniInvalido(dni);
		}
		catch(DniInvalido e)
		{
			System.out.println("El DNI ingresado es invalido");
			e.printStackTrace();
		}
		
		
		try {
			Archivo archivo = new Archivo();
			archivo.setRuta("Personas.txt");
			
			CrearLista crearLista = new CrearLista();
			crearLista.setArchivo(archivo);
			crearLista.mostrarLista(crearLista.crearLista());
			
		}catch (Exception e)
		{
			System.out.println("no se pudo crear la lista");
			e.printStackTrace();
		}
		
		
	}

}
