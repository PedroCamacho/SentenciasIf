import java.util.Scanner;

public class IfAnidados {

	public static void main(String[] args) {
		/*
		 * TODO: Realizar un programa que solicite un número entero positivo y
		 * muestre por pantalla si tiene 1, 2 ó más cifras
		 */
		
		//Entrada	
		Scanner in = new Scanner (System.in);
		System.out.print("Introduzca un número: ");
		int numero =  in.nextInt();
		String respuesta = "";
		
		//Proceso
		if (numero<10) {
			respuesta = "1 cifra";
		} else if (numero<100) {
			respuesta = "2 cifras";
		} else {
			respuesta = "más de 2 cifras";
		}
		
		//Salida
		System.out.println("El numero tiene " + respuesta);

	}

}
