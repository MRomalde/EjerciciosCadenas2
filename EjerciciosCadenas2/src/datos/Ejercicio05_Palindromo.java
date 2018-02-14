package datos;

import java.util.Scanner;

public class Ejercicio05_Palindromo {
	private static Scanner sc= new Scanner (System.in);
//	Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al revés. Por ejemplo, cada
//	uno de los siguientes enteros de cinco dígitos es un palíndromo: 12321, 55555, 45554. Escriba una
//	aplicación que lea un entero de cinco dígitos y determine si es un palíndromo. Si el número no es de cinco
//	dígitos, debe saltar una excepción creada. 
public static void main(String[] args) {
	
	System.out.println("Escriba un número de 5 cifras: ");
	String palindromo=sc.next();
	StringBuffer sB = new StringBuffer(palindromo); 
	sB.reverse();
	String palindromoReves=sB.toString();
	
	System.out.println(palindromo);
	System.out.println(palindromoReves);

	if(palindromo.equals(palindromoReves))
		System.out.println("Es palíndromo");
	else
		System.out.println("No es palíndromo");
	
}
}
