package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Intoduce un número");
		int numero = entrada.nextInt();
		System.out.println("Intoduce otro número");
		int numero1 = entrada.nextInt();
		
		/*System.out.println("SUMA");
		System.out.println(numero + numero1);
		System.out.println("RESTA");
		System.out.println(numero - numero1);
		System.out.println("DIVISIÓN");
		System.out.println(numero / numero1);
		System.out.println("MULTIPLICACIÓN");
		System.out.println(numero * numero1);*/
		
		System.out.println("Introduce la operacion que quieres realizar: +,-,/,*");
		String number = entrada.next();
		
		switch(number) {
			case "+":
				System.out.println(numero + numero1);	
				break; //Termina un flujo
			case "-":
				System.out.println(numero - numero1);
				break;
			case "/":
				System.out.println(numero / numero1);
				break;
			case "*":
				System.out.println(numero * numero1);
				break;
			default:
				System.out.println("Operación no valida"); 
		}
		
		entrada.close();
	}

}
