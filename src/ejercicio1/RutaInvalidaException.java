package ejercicio1;

public class RutaInvalidaException extends RuntimeException{

	public RutaInvalidaException () {
		
	}
	
	@Override
	public String getMessage() {
		
		return "No se econtro la ruta del archivo \n";
	}
}
