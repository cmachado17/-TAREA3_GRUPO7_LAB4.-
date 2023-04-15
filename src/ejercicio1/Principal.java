package ejercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String dni = JOptionPane.showInputDialog("Ingrese su dni: ");
	    Dni.verificarDniInvalido(dni);
		}
		catch(DniInvalido e)
		{
			System.out.println("El DNI ingresado es invalido");
			e.printStackTrace();
		}
	}

}
