package Ejercicio1Repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas posiciones quieres que contenga tu array?");
		int[] numeros = new int[entrada.nextInt()];
		
		System.out.print("[");
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]);
			if(i<numeros.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		entrada.close();
	}

}
