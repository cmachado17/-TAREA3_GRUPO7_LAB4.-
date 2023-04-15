package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

	public DniInvalido() {
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "DNI invalido";
	}
	
	
}
