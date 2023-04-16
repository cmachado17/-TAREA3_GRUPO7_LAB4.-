package ejercicio1;

public class Persona {
	private String Nombre;
	private String Apellido;
	private String Dni;
	
	// Constructores
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String dni) {
		super();
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
}
