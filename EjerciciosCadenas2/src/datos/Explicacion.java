package datos;

import javax.sound.midi.Synthesizer;

public class Explicacion {
public static void main(String[] args) {
	String cadena1= "valor1";
	String cadena2= "valor2";

	if(cadena1.compareTo(cadena2)==0) {//si da 0 es que son iguales si da 
		//<0 la segunda es mas grande si es >0 la primera es mas grande
		System.out.println("iguales");
	}
	else {
		System.out.println("Distintas");
	}
	String res=cadena1.concat(cadena2);
	System.out.println(res);
//te muestra si la cadena tiene la cadena que tu le metas
	if(cadena1.contains("or"))
		System.out.println("Sí");
	else
		System.out.println("No");
	
	//Te muestra si termina  con los valores que le metas
	if(cadena1.endsWith("or2"))
		System.out.println("Sí termina");
	else
		System.out.println("No termina");
	//Busca la primera posición de el
	//caracter que le metas a buscar, tambien puedes poner la posición de inicio
	//de la busqueda añadiendo la posicion ademas de la letra a buscar
	System.out.println(cadena1.indexOf("a",2));
	
	//comprueba si la cadena esta vacía, es mejor la segunda opcion o la tercera
	//la primera no es recomendable
	if(cadena1.equals("") || cadena1.length()==0 || cadena1.isEmpty())
		System.out.println("Cadena vacía");
	
	//lo mismo que el index pero la ultima
	System.out.println(cadena1.lastIndexOf("a",2));
	//reemplaza una letra por otra.(cambia la a por la o)
	System.out.println(cadena1.replace("a", "o"));
	//divide una cadena en subcadenas en funcion de un delimitador
	String texto="1;javier;ruano;38;sevilla";
	//te rellena la tabla con lo anterior a ; o el delimitador que elijas
	String [] tabla = texto.split(";");
	// foreach primero tipo de tabla, segundo variable que va a guardar el valor,
	//tercero el nombre de la tabla 
	for (String aux : tabla) {
		System.out.println(aux);
	}
	//substring lo que hace es devolver una subcadena desde la posicion que elijas
	//hasta el final o le puedes meter hasta la posición que quieras
	//la posición del final está excluida por lo que hay que añadirle
	//una posición mas
	System.out.println("Texto:" + texto.substring(2,7));
	//convertir el texto en un arrays o tabla de caracteres
	char [] letras = texto.toCharArray();
	//los dos bucles son iguales
	for (char c : letras) {
		System.out.println(c);
	}
	for (int i = 0; i < letras.length; i++) {
		System.out.println(letras[i]);
	}
	
	
	String nombre= " JAVIER ";
	//el trim quita los espacios por delante y por detras
	System.out.println(nombre.trim().length());
	
	int a = 23;
	//Convertir un entero a una cadena con valueOf
	String aa = String.valueOf(a);
	System.out.println(aa);
	
	
	//para modificar una cadena original, es igual que el string pero el string
	//no modifica la cadena original, el stringbuffer si
	StringBuffer sb = new StringBuffer("hola");
	//el append añade la siguiente cadena a la que anteriormente la has guardado
	//en el stringBuffer
	sb.append(" que tal");
	System.out.println(sb);
	//borra desde la posicion primera que marques hasta la posicion final que marques
	//recordar que la ultima posicion no esta incluida
	sb.delete(4, sb.length());
	System.out.println(sb);
	//quita el caracter que esta en la posicion que indiques
	sb.deleteCharAt(0);
	System.out.println(sb);
	//inserta en la posicion que indiques lo que tu indiques
	sb.insert(2, "texto");
	System.out.println(sb);
	//replace sirve para reemplazar en la posicion que indiques, desde, hasta
	//(el hasta esta excluida)y lo que reemplazas
	sb.replace(0, 2, "nuevo");
	System.out.println(sb);
	//reverse sirve para cambiar las posiciones del ultimo al primero...
	System.out.println(sb.reverse());
			
}
}
