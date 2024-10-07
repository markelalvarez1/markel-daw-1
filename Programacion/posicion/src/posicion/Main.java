package posicion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[8]; 

		
		System.out.println("Ingrese 8 n�meros:");
		for (int i = 0; i < 8; i++) {
			System.out.print("N�mero " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}

		
		System.out.print("Ingrese el n�mero que desea buscar: ");
		int numeroBuscado = entrada.nextInt();

		
		int posicion = -1; 
		for (int i = 0; i < 8; i++) {
			if (numeros[i] == numeroBuscado) {
				posicion = i; 
				break; 
			}
		}

		if (posicion != -1) {
			System.out.println("El n�mero " + numeroBuscado + " se encuentra en la posici�n " + (posicion + 1) + ".");
		} else {
			System.out.println("El n�mero " + numeroBuscado + " no se encontr� en el array.");
		}

		entrada.close();
	}
}