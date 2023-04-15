package ejercicio1;


public class Dni {
	
	public Dni() {
		
	}
	
	public static boolean verificarDniInvalido (String dni) throws DniInvalido
	{
		Boolean auxLetras = false; 
		
		for(int i = 0; i < dni.length(); i++) {
			if(!Character.isDigit(dni.charAt(i)))
				auxLetras=true;
		}
		
		if(auxLetras == true) {
			throw new DniInvalido();
		}
		
		return auxLetras;
	}
	

}
