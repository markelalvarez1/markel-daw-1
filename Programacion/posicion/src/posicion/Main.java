package posicion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[8]; 

		
		System.out.println("Ingrese 8 números:");
		for (int i = 0; i < 8; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}

		
		System.out.print("Ingrese el número que desea buscar: ");
		int numeroBuscado = entrada.nextInt();

		
		int posicion = -1; 
		for (int i = 0; i < 8; i++) {
			if (numeros[i] == numeroBuscado) {
				posicion = i; 
				break; 
			}
		}

		if (posicion != -1) {
			System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + (posicion + 1) + ".");
		} else {
			System.out.println("El número " + numeroBuscado + " no se encontró en el array.");
		}

		entrada.close();
	}
}