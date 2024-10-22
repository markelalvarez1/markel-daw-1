package estructuras;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ESTRUCTURAS CONTROL DE FLUJO

		// condicionales
		Scanner entrada = new Scanner(System.in);

		/*
		 * System.out.println("Introduce tu edad"); int edad = entrada.nextInt();
		 */

		// edad>=18
		/*
		 * if(edad>=18) { System.out.println("Acceso permitido"); } else {
		 * System.out.println("Acceso denegado"); }
		 */

		/*
		 * if (edad >= 16 && edad < 18) {
		 * System.out.println("Acceso permitido con tutor"); }
		 * 
		 * if (edad >= 18) { System.out.println("Acceso permitido"); }
		 * 
		 * if (edad < 18) { System.out.println("Acceso denegado"); }
		 */

		/*
		 * if (edad >= 16 && edad < 18) {
		 * System.out.println("Acceso permitido con tutor"); } else if(edad >= 18) {
		 * System.out.println("Acceso permitido"); } else {
		 * System.out.println("Acceso denegado"); }
		 */

		/*
		 * System.out.println("Introduce inicial del día de la semana"); String dia =
		 * entrada.next();
		 * 
		 * switch(dia) { case "l": System.out.println("Lunes"); break; //Termina un
		 * flujo case "m": System.out.println("Martes"); break; case "x":
		 * System.out.println("Miercoles"); break; case "j":
		 * System.out.println("Jueves"); break; case "v": System.out.println("Viernes");
		 * break; default: System.out.println("Día no valido"); }
		 */
		// repetitivas - bucle (for, while,do.. while: cuando no se sabe las veces que
		// se va a repetir )
		// for(inicializacion;condicion;cadaVuelta)
		for (int i = 10; i < 0; i++) {
			System.out.println("Mensaje " + i);
		}

		System.out.println("Introduce tu nombre:");
		String nombre = entrada.next();
		/*
		 * Markel System.out.println(nombre.charAt(0));
		 * System.out.println(nombre.charAt(1)); System.out.println(nombre.charAt(2));
		 * System.out.println(nombre.charAt(3)); System.out.println(nombre.charAt(4));
		 * System.out.println(nombre.charAt(5));
		 */

		for (int i = nombre.length() - 1; i >= 0; i--) {
			System.out.println(nombre.charAt(i));
		}

		// int numeroOculto = 5;
		Random random = new Random();
		int numeroOculto = random.nextInt(10) + 1; // Genera un número entre 1 y 10

		while (true) {
			System.out.println("Introduce un número del 1-10:");
			int numeroUsuario = entrada.nextInt();

			if (numeroUsuario == numeroOculto) {
				System.out.println("Has acertado");
				break;
			}
		}

		// do..while 1..n (cuando necesitamos que el codigo se realiza más de una vez)

		int numeroUsuario = 0;
		do {
			System.out.println("Introduce un número del 1-10:");
			numeroUsuario = entrada.nextInt();
		} while (numeroUsuario != numeroOculto);
		
		System.out.println("Has acertado");

		System.out.println("Fin del programa");

		entrada.close();
	}

}
