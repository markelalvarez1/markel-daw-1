package burbujascendente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Introduce 10 numeros:");
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = entrada.nextInt();
		}
		
		for(int i=0; i<numeros.length - 1; i++) {
			for(int j=0; j<numeros.length - 1 - i; j++) {
				if(numeros[j]>numeros[j+1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		
		entrada.close();

	}

}