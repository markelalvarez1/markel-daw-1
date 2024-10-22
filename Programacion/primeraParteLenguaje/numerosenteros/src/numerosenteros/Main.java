package numerosenteros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el 1º numero:");
		int numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el 2º numero:");
		int numero2 = entrada.nextInt();
		
		System.out.println("Ingresa el 3º numero:");
		int numero3 = entrada.nextInt();
		
		System.out.println("Ingresa el 4º numero:");
		int numero4 = entrada.nextInt();
		
		System.out.println("Ingresa el 5º numero:");
		int numero5 = entrada.nextInt();
		
		int numeroMasAlto = Math.max(Math.max(Math.max(numero1, numero2), numero3), Math.max(numero4, numero5));
		
		System.out.println("El numero entero más alto es " +numeroMasAlto);

		entrada.close();
	}

}
