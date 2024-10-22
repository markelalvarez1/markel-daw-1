package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número para sacar la su número factorial:");
		int numero = entrada.nextInt();
		int resultado = 1;

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}

		System.out.println("El número factorial es: " + resultado);

		entrada.close();
	}

}
