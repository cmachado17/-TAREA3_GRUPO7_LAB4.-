package ejercicio1;

import java.io.IOException;

public class ListaInvalidaException extends Exception{
	
	public ListaInvalidaException() {
		
	}

	@Override
	public String getMessage() {
		
		return "No se pudo generar la lista \n";
	}

	
}
