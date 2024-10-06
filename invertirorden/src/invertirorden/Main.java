package invertirorden;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[6];

		System.out.println("Ingrese 6 números:");
		for (int i = 0; i < 6; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[5 - i];
			numeros[5 - i] = temp;
		}

		System.out.println("Array invertido:");
		for (int i = 0; i < 6; i++) {
			System.out.print(numeros[i] + " ");
		}

		entrada.close();
	}
}