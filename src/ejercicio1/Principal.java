package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> listaPers = new ArrayList<>();
		Archivo ar = new Archivo();
		ListIterator <Persona> it = listaPers.listIterator();
		
		try
		{
			String dni = JOptionPane.showInputDialog("Ingrese su dni: ");
			Persona.verificarDniInvalido(dni);
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
			crearLista.mostrarLista(listaPers=crearLista.crearLista());
		}
		catch (Exception e)
		{
			System.out.println("no se pudo crear la lista");
			e.printStackTrace();
		}


		while (it.hasNext()) {
			Persona p = it.next();
			System.out.println(p.toString());
		}

		ar.crearArchivoDesdeLista("Resultado.txt", listaPers);
	}
}
