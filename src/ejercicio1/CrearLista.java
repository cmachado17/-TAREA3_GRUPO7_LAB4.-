package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CrearLista {
	
	private Archivo archivo;
	
	//constructor
	public CrearLista() {
		
	}
	
	//Metodos
	
	public  ArrayList <Persona>  crearLista() {
		
	ArrayList <Persona> listaPersonas = new ArrayList <Persona> ();
	Iterator <String>it = archivo.lee_lineas().iterator();
	
	if	(archivo.existe()) {
		while(it.hasNext()) {//pregunto si hay siguiente para recorrer
		String [] e = it.next().split("-");//guardo el elemento actual que esta recorriendo.
		if(e[0] != "" && e[1] != "" && e[2] != "") {
	
		    if(Persona.verificarDniInvalido1(e[2])) {
			Persona persona = new Persona(e[0], e[1], e[2]);
			 System.out.println("Se anadio uno...");
			listaPersonas.add(persona);
		}
	     
	     }
		 }
	   
	
	}
	//ordenamos la lista
	Collections.sort(listaPersonas);
	
	//devolver la lista ordenada
	return listaPersonas;
	
}

	//getters y setters
	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
	
	//mostrar lista ordenada
		public void mostrarLista (ArrayList<Persona> lista) {
			for (Persona persona : lista) {
				System.out.println(persona);
			}
		}
}
