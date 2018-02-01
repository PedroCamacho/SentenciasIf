
public class CasoEspecialString {

	public static void main(String[] args) {
		//Comparaci�n con Strings
		String nombre = "Pedro";
		String apellido = "Camacho";
		String nombreApellido = "PedroCamacho";
		String nombreMasApellido = nombre + apellido;
		
		//No se debe utilizar el == 
		if (nombreApellido == nombreMasApellido)
			System.out.println("M�todo err�neo -> Son iguales");
		else
			System.out.println("M�todo err�neo -> Son diferentes");
		
		//Hay que utilizar el m�todo equals ()
		if (nombreApellido.equals(nombreMasApellido))
			System.out.println("M�todo correcto -> Son iguales");
		else
			System.out.println("M�todo correcto -> Son diferentes");
	}

}
