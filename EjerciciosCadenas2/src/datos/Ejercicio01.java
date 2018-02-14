package datos;

public class Ejercicio01 {
public static void main(String[] args) {
	String palabra="colegioconcoche";
	
	//muestra el string en mayusculas
	System.out.println(palabra.toUpperCase());
	//en minusculas
	System.out.println(palabra.toLowerCase());
	//Mostrar los dos primeros caracteres y los dos ultimos
	if(palabra.length()>=2) {
		System.out.println(palabra.substring(0, 2));
	    System.out.println(palabra.substring(palabra.length()-2));
	}
	//Numero de ocurrencias del ultimo caracter
	int contador=0;
	for (int i = 0; i < palabra.length(); i++) {
		if(String.valueOf(palabra.charAt(i)).equalsIgnoreCase(String.valueOf(palabra.charAt(palabra.length()-1))))
			contador++;		
	}
	System.out.println("La letra: "+ palabra.charAt(palabra.length()-1) + " sale " + contador + " veces");
	
	//reemplazar las ocurrencias el primer caracter por el primer caracter
	//en mayuscula
	palabra=palabra.replaceAll(palabra.substring(0, 1),palabra.substring(0, 1).toUpperCase());
	System.out.println(palabra);
	
	StringBuffer sb = new StringBuffer(palabra);
	
	//añadir por el principio y por el final la cadena "***"
	sb.append("***");
	sb.insert(0, "***");
	System.out.println(sb);
	
	
	
}
}
