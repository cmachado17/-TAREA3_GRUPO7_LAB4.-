package ejercicio1;

public class Persona implements Comparable <Persona>{
	
	private String Nombre;
	private String Apellido;
	private String Dni;
	
	// Constructores
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String dni) {
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
	}

	
	// Getters y Setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	
	//metodo para ordenar comparando las personas
			@Override
			public int compareTo(Persona otra) {
				//compara un string con otro y por default es ascdendente
				return this.Apellido.compareTo(otra.Apellido);
			}

			@Override
			public String toString() {
				return "Persona [Apellido=" + Apellido + ", Nombre= " + Nombre + ", Dni=" + Dni + "]";
			}
			
			

	public static Boolean verificarDniInvalido(String dni) throws DniInvalidoException {
		Boolean auxLetras = false; 
		
		
			for(int i = 0; i < dni.length(); i++) {
				if(!Character.isDigit(dni.charAt(i)))
					auxLetras=true;
			}
		
			if(auxLetras == true) {
				throw new DniInvalidoException();
			}
		
			return auxLetras;		
			
	}

}

