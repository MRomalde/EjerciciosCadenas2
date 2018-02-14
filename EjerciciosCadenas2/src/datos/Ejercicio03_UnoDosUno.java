package datos;

public class Ejercicio03_UnoDosUno {
//	1. Aplicar las operaciones básicas de modificación de Strings a la cadena “Uno
//	dosuno”, añadiéndole caracteres al final, cambiando la “o” por “e” y pasándola a
//	mayúscula
public static void main(String[] args) {

	String cadena="Unodosuno";
	
	cadena=cadena.concat("***");
	System.out.println(cadena);
	cadena=cadena.replace("o", "e");
	System.out.println(cadena);
	cadena=cadena.toUpperCase();
	System.out.println(cadena);
	//2. Describa y corrija los errores que aparecen en el programa siguiente:
		
		 //Contamos cuántas vocales minúsculas hay en la cadena, las pasmos a
		 //mayúsculas, y vemos si coincide el valor inicial y el final
System.out.println("Parte2");
		 int cont = 0;
		 //en String no se pone new string, las comillas no son las necesarias
		 String s1, s2=new String("hola que tal"); 		
		//se pone s1=s2
		s1 = s2;
		//el metodo Trim se pone cuando ya se ha inicializado
		s1.trim();
		//las comillas no eran las necesarias
		System.out.println("s1 == s2:" + (s1==s2));
		//desde la primera que es el 0, hasta s1.length-1, por eso se quita el igual
		for (int i=0; i<s1.length();i++)
		{
		//tambien añadimos las vocales en mayusculas
		 if(s1.charAt(i) == 'a' || s1.charAt(i)=='e' ||
		s1.charAt(i)=='i' || s1.charAt(i)=='o' ||
		s1.charAt(i)=='u' || s1.charAt(i)=='A' || s1.charAt(i)=='E'
		|| s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')
		{
		 cont++;
		 //Eso corta la frase, lo que haces es reemplazar la minuscula con la mayuscula
		 s1=s1.replace('a', 'A');
		 s1=s1.replace('e', 'E');
		 s1=s1.replace('i', 'I');
		 s1=s1.replace('o', 'O');
		 s1=s1.replace('u', 'U');
		}
		 }
		//las comillas estan mal
		System.out.println("s1:" + s1 + ":");
		System.out.println("s2:" + s2 + ":");
		System.out.println("s1 == s2:" + (s1==s2));
		System.out.println("Número de Vocales=" + cont);
		}
		} 