package datos;

import java.util.Scanner;

public class Ejercicio06_Codificación {
//Crear una clase que permita cifrar cadenas de caracteres usando el algoritmo de cifrado
//simple consistente en asignar a cada carácter aquel que resulte de sumar un valor a su
//código ASCII. (La asignación será circular, es decir, si el valor es 2, al carácter “z” le
//corresponderá la “b”)
	private static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
	

	System.out.println("Por Favor, indique la frase a cifrar: ");
	String frase=sc.nextLine();
	String fraseCodificada=codificaFrases(frase);
	
	System.out.println("La frase que ha metido es: " + frase);
	System.out.println("La frase codificada es: " + fraseCodificada);

}
private static String codificaFrases(String frase) {
	String fraseCodificada="";
	int a= ("a").codePointAt('a');
	StringBuffer sB=new StringBuffer();
	int nuevaLetra=0;
	for (int i = 0; i < frase.length(); i++) {
		 if(frase.codePointAt(i)> a && frase.codePointAt(i)< a+26) {
			 nuevaLetra+=frase.codePointAt(i)+20;
			 if(nuevaLetra>a+26)
				 nuevaLetra-=a+26;
			 sB.append(nuevaLetra);
		 }
		 fraseCodificada=sB.toString();
	}
	return fraseCodificada;
}
}