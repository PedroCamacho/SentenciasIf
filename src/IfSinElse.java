import java.util.Scanner;

public class IfSinElse {

	public static void main(String[] args) {
		//Entrada
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número par: ");
		int numero = sc.nextInt();
		boolean esPar;
		
		//Proceso
		esPar = numero%2 == 0;
		
		//Salida
		if (!esPar)
			System.out.println("Ese número no era par");
		
		System.out.println("Fin del programa");
	}
}
