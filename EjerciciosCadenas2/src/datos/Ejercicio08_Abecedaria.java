package datos;

import java.util.Scanner;

public class Ejercicio08_Abecedaria {
	private static Scanner sc = new Scanner(System.in);

	// UNA PALABRA SE DICE ABECEDARIA SI LAS LETRAS QUE LA FORMAN SE ENCUENTRA EN
	// ORDEN ALFABÉTICO, SI SON LEÍDAS DE IZQUIERDA A DERECHA. POR EJEMPLO,
	// LAS SIGIENTES PALABRAS CUMPLEN CON SER ABECEDARIAS: AMOR, FILO.
	// ESCRIBA UN MÉTODO QUE DIGA SI UNA PALABRA ES ABECEDARIA, EL METODO RECIBE
	// UN STRING COMO PARÁMETRO Y RETORNA VERDADERO EN CASO DE QUE LA PALABRA
	// SEA ABECEDARIA, Y FALSO EN CASO CONTRA
	public static void main(String[] args) {
		System.out.println("Escriba una palabra:");
		String palabra = sc.next();

		boolean esAbecedaria = metodoAbecedaria(palabra);
		if (esAbecedaria)
			System.out.println("es abecedaria");
		else
			System.out.println("no es abecedaria");
	}

	private static boolean metodoAbecedaria(String palabra) {
		int valor = palabra.charAt(0);
		for (int i = 1; i < palabra.length(); i++) {
			if (valor < palabra.charAt(i)) {
				valor = palabra.charAt(i);
			} else
				return false;
		}
		if (valor == palabra.charAt(palabra.length() - 1))
			return true;
		else
			return false;

	}
}
