package datos;

import java.util.Scanner;

public class Ejercicio09_Espejo {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Palabra:");
	String palabra = sc.next();
	
	String palabraEspejo=espejo(palabra);
	System.out.println(palabra + " y la palabra espejo es: " + (palabra+palabraEspejo));
}
private static String espejo(String palabra) {
	
	String trozo=palabra.substring(0,palabra.length()-1);
	StringBuffer sB = new StringBuffer(trozo);
	sB.reverse();
	trozo=sB.toString();
	return trozo;
}
}
