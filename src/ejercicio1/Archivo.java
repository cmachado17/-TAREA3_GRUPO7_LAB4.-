package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Archivo {

	//Si en la variable ruta recibe solo un nombre de un archivo, entonces crea ese archivo dentro del proyecto
	//Si en ruta recibe una ruta absoluta, entonces lo crea en esa ruta
	
	private String ruta;

	public boolean existe()
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
	
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public HashSet <String> lee_lineas() throws ListaInvalidaException, RutaInvalidaException{
		FileReader entrada;
		
		HashSet <String> lista = new HashSet <String> ();
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
			while (linea != null) {
				
				lista.add(linea);
				
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();
		

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
			catch (RutaInvalidaException e) {
			System.out.println(e + "\n");
		}
		
		
		return lista;
	}

	public boolean crearArchivoDesdeLista(String nombreArchivo, ArrayList<Persona> Lista)throws IOException
	{
		FileWriter escritura;
		ruta=nombreArchivo;
		try {
			escritura = new FileWriter(nombreArchivo, true);
			for (Persona persona : Lista) {
				escritura.write(persona.getApellido()+"-");
				escritura.write(persona.getNombre()+"-");
				escritura.write(persona.getDni());
				escritura.write(13);				
			}
			escritura.close();
			return true;
		} catch (IOException e) {
			System.out.println("No se pudo generar el listado.");
			e.printStackTrace();
		}
		return false;
		
	}
	
	//getters y setters
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
