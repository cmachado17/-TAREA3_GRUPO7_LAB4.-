package ejercicio1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Lista {

	private Archivo archivo;

	//constructor
	public Lista() {

	}

	//Metodos

	public  ArrayList <Persona>  crearLista() throws ListaInvalidaException, DniInvalidoException {

	 
		ArrayList <Persona> listaPersonas = new ArrayList <Persona> ();
		
		try {
			
		Iterator <String>it = archivo.lee_lineas().iterator();
		boolean tieneFallas = false;

		if(archivo.existe()) {
			while(it.hasNext()) {//pregunto si hay siguiente para recorrer
				String [] e = it.next().split("-");//guardo el elemento actual que esta recorriendo.
				if(e[0] != "" && e[1] != "" && e[2] != "") {
					try {
						if(!Persona.verificarDniInvalido(e[2])) {
							Persona persona = new Persona(e[0], e[1], e[2]);
							listaPersonas.add(persona);
						}
					}
					catch (DniInvalidoException ex){
						tieneFallas=true;
						System.out.println(ex + ": " + e[2] + " de " + e[1] + "," + e[0] + "\n");
						
					}
				}
			}
			if(tieneFallas) {
				System.out.println("No se pudieron agregar todos los registros a la lista porque algunos tenían errores \n");							
			}
			else {
				System.out.println("Listado generado correctamente!\n");
			}
		}

		//ordenamos la lista
		Collections.sort(listaPersonas);
		
		}catch(ListaInvalidaException e) {
			System.out.println(e + "\n");
		}
	
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
