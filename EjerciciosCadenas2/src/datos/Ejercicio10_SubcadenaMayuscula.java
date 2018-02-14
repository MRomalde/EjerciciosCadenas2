package datos;

import java.util.Scanner;

public class Ejercicio10_SubcadenaMayuscula {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Escriba la frase: ");
	String frase=sc.nextLine();
	System.out.println("Escriba la palabra a poner en mayuscula");
	String palabra=sc.next();
	
	System.out.println("La frase convertida es: " + ConvierteMayuscula(frase, palabra));
	
}
private static String ConvierteMayuscula(String frase, String palabra) {
	String palabraMayuscula="";
	if (frase.contains(palabra))
	palabraMayuscula=palabra.toUpperCase();
	frase = frase.replace(palabra, palabraMayuscula);
	return frase;
}
}
