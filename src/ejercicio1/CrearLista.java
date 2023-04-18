package ejercicio1;

import java.util.HashSet;
import java.util.TreeSet;

public class CrearLista {
	
	private Archivo archivo;
	
	//constructor
	public CrearLista() {
		
	}
	
	//Metodos
	
	public  void crearLista() {
		
	TreeSet <Persona> listaPersonas = new TreeSet <Persona> ();
	Persona persona = new Persona();
	
	if	(archivo.existe()) {
		
		for (String elemento : archivo.lee_lineas()) {
			String[] partes = elemento.split("-");
			persona.setNombre(partes[0]);
			persona.setApellido(partes[1]);
			persona.setDni(partes[2]);
			listaPersonas.add(persona);
			}
	}
	
	
}

	//getters y setters
	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
}
