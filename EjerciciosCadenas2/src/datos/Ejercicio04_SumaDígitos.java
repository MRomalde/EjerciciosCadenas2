package datos;

import java.util.Scanner;

public class Ejercicio04_SumaDígitos {
	private static Scanner sc = new Scanner(System.in);

	// 3. Escriba un método que, dada una cadena de caracteres, de la suma de todos
	// los
	// dígitos que hay en ella. Por ejemplo, si la cadena es abc12de3f4, dará como
	// resultado
	// 10.
	public static void main(String[] args) {
		int num;
		String captura;
		System.out.println("Escriba y se diran los dígitos escritos: ");
		captura = sc.nextLine();
		num = sumaDigitos(captura);

		System.out.println("El la suma numérica de los dígitos: " + num);
	}

private static int sumaDigitos(String next) {
	int num=0;
	int cero=("0").codePointAt(0);
	for (int i = 0; i < next.length(); i++) {
		if(next.codePointAt(i)>= cero && next.codePointAt(i)< cero +10)
			num+=(next.codePointAt(i)-cero);
	}
	return num;
}
//private static int sumaDigitosV2 (String cadena) {
//	int num2=0;
//	for (int i = 0; i < cadena.length(); i++) {
//		int c = Integer.parseInt(cadena.substring(i,i+1));
//		num2+=c;
//	}
//	return num2;
//	}
}
