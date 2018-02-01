
public class CasoEspecialReales {

	public static void main(String[] args) {
		//Comparaci�n con n�meros decimales
		double numero = 2;
		double raizCuadrada = Math.sqrt(numero);
		double similar = raizCuadrada * raizCuadrada;
		//No se puede utilizar simplemente el ==
		if (numero == similar)
			System.out.println("M�todo err�neo -> Son iguales");
		else
			System.out.println("M�todo err�neo -> Son diferentes");
		
		//Lo que importa es si son muy similares
		final double EPSILON = 1e-12;
		if (Math.abs(numero - similar)<EPSILON)
			System.out.println("M�todo correcto -> Son iguales");
		else
			System.out.println("M�todo correcto -> Son diferentes");

	}

}
