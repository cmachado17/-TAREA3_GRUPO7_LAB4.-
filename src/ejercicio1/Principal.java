package ejercicio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws DniInvalidoException, ListaInvalidaException {
		
		ArrayList<Persona> listaPers = new ArrayList<>();
		Archivo archivo = new Archivo();
		
		
		try
		{
			String dni = JOptionPane.showInputDialog("Ingrese su dni: ");
			Persona.verificarDniInvalido(dni);
		}
		catch(DniInvalidoException e)
		{
			System.out.println("El DNI ingresado es invalido \n");
			//e.printStackTrace();
		}


		try {
			
			archivo.setRuta("Personas.txt");

			Lista crearLista = new Lista();
			crearLista.setArchivo(archivo);
			crearLista.mostrarLista(listaPers=crearLista.crearLista());
		}
		catch (ListaInvalidaException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}


		try {
			
				if(archivo.existe()) {
					archivo.crearArchivoDesdeLista("Resultado.txt", listaPers);
					System.out.println("\n El archivo se creo correctamente \n");
			}
			
		}catch(IOException e) {
			
			System.out.println("\n El archivo no pudo ser creado \n");
		}
		
	}
}
