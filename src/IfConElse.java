import java.util.Scanner;

public class IfConElse {

	public static void main(String[] args) {
		//Entrada
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un n�mero par: ");
		int numero = sc.nextInt();
		boolean esPar;
		
		//Proceso
		esPar = numero%2 == 0;
		
		//Salida
		if (!esPar)
			System.out.println("Ese n�mero no era par");
		else
			System.out.println("Bien, el n�mero es par");
		
		System.out.println("Fin del programa");
	}

}