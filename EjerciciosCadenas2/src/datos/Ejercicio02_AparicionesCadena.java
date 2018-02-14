package datos;

import java.util.Scanner;

public class Ejercicio02_AparicionesCadena {
	private static Scanner sc = new Scanner(System.in);
//	Realizar un programa que reciba dos cadenas de caracteres y cuente el número de 
//	apariciones de la	primera en la segunda. 
public static void main(String[] args) {
	System.out.println("Por favor escriba la palabra a buscar: ");
	String palabra = sc.nextLine();
	System.out.println("Por favor escriba la frase en la que buscar: ");
	String frase = sc.nextLine();

	int contador=0;
	int posicion=frase.indexOf(palabra);
	int nuevaPosicion;
	if(posicion==-1) {
		System.out.println("La palabra no sale en la frase");
	}
	else {
		contador++;
		for (int i =frase.indexOf(palabra,posicion+palabra.length()); i < frase.length(); i++) {
		nuevaPosicion=frase.indexOf(palabra,posicion+palabra.length());
		if(nuevaPosicion!=-1) {
			contador++;
			posicion=nuevaPosicion;
		}
		}		
	System.out.println("La palabra: " + palabra + " sale " + contador + " vez/ces en la frase");
}
	/* Otra forma de hacerlo mucho mas eficiente
	 * do{
	 * contador++;
	 * posicion=frase.indexOf(palabra, pos + palabra.lenght());
	 * }while(posicion!=-1); 
	 * */
}
}