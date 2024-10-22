package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra:");
		String palabra = entrada.nextLine();
		String fraseSinEspacios = "";
		String palabraAlreves = "";

		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabraAlreves = palabraAlreves + palabra.charAt(i);
		}
		if (palabra.equalsIgnoreCase(palabraAlreves)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}

		System.out.println("Ingresa una frase:");

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) != ' ') {
				fraseSinEspacios = fraseSinEspacios + palabra.charAt(i);
			}
		}
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			palabraAlreves = palabraAlreves + fraseSinEspacios.charAt(i);
		}
		if (fraseSinEspacios.equalsIgnoreCase(palabraAlreves)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
		entrada.close();
	}
}
