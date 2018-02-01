
public class CasoEspecialString {

	public static void main(String[] args) {
		//Comparación con Strings
		String nombre = "Pedro";
		String apellido = "Camacho";
		String nombreApellido = "PedroCamacho";
		String nombreMasApellido = nombre + apellido;
		
		//No se debe utilizar el == 
		if (nombreApellido == nombreMasApellido)
			System.out.println("Método erróneo -> Son iguales");
		else
			System.out.println("Método erróneo -> Son diferentes");
		
		//Hay que utilizar el método equals ()
		if (nombreApellido.equals(nombreMasApellido))
			System.out.println("Método correcto -> Son iguales");
		else
			System.out.println("Método correcto -> Son diferentes");
	}

}
