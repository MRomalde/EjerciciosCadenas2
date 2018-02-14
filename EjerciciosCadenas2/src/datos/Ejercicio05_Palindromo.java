package datos;

import java.util.Scanner;

public class Ejercicio05_Palindromo {
	private static Scanner sc= new Scanner (System.in);
//	Un pal�ndromo es una secuencia de caracteres que se lee igual al derecho y al rev�s. Por ejemplo, cada
//	uno de los siguientes enteros de cinco d�gitos es un pal�ndromo: 12321, 55555, 45554. Escriba una
//	aplicaci�n que lea un entero de cinco d�gitos y determine si es un pal�ndromo. Si el n�mero no es de cinco
//	d�gitos, debe saltar una excepci�n creada. 
public static void main(String[] args) {
	
	System.out.println("Escriba un n�mero de 5 cifras: ");
	String palindromo=sc.next();
	StringBuffer sB = new StringBuffer(palindromo); 
	sB.reverse();
	String palindromoReves=sB.toString();
	
	System.out.println(palindromo);
	System.out.println(palindromoReves);

	if(palindromo.equals(palindromoReves))
		System.out.println("Es pal�ndromo");
	else
		System.out.println("No es pal�ndromo");
	
}
}
