package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero para sacar la su n�mero factorial:");
		int numero = entrada.nextInt();
		int resultado = 1;

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}

		System.out.println("El n�mero factorial es: " + resultado);

		entrada.close();
	}

}
