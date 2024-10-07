package multiplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número para sacar sus múltiplos:");
		int numero = entrada.nextInt();
		int resto;
		int resultado;
	
		
		for (int i=1; i <= numero; i++ ) {
			resto = numero%i;
			resultado = numero/i;
			
			if (resto== 0) {
			System.out.println("Los multiplos son: " +resultado);
		}
		}
		
		
		entrada.close();
	}

}
