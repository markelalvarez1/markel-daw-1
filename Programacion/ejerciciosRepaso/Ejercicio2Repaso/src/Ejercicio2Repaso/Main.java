package Ejercicio2Repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuantas posiciones quieres que contenga tu array?");
		int[] numeros = new int[entrada.nextInt()];

		System.out.println("1.- Con ceros\r\n" + "2.- Con números aleatorios del 1 al 100\r\n"
				+ "3.- Insertando los números manualmente.");
		int eleccion = entrada.nextInt();

		switch (eleccion) {
		case 1:
			System.out.print("[");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
				if (i < numeros.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
			break;
		case 2:
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = (int) (Math.random() * 100);
			}
			System.out.print("[");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
				if (i < numeros.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
			break;
		case 3:
			System.out.println("Introduce los numeros que deseas:");

			for (int i = 0; i < numeros.length; i++) {
				System.out.print("Numero " + (i + 1) + ": ");
				numeros[i] = entrada.nextInt();
			}

			System.out.print("[");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
				if (i < numeros.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
			break;
			default:
				System.out.println("Las opciones del programa es del 1 al 3");
		}

		entrada.close();
	}
}
