package numerosenteros;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//int [] numeros = new int[5];
		
		System.out.println("Introduce el 1º numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce el 2º numero");
		int num2 = entrada.nextInt();
		
		System.out.println("Introduce el 3º numero");
		int num3 = entrada.nextInt();
		
		System.out.println("Introduce el 4º numero");
		int num4 = entrada.nextInt();
		
		System.out.println("Introduce el 5º numero");
		int num5 = entrada.nextInt();
		
		//numeros[0] = num1;
		//numeros[1] = num2;
		//numeros[2] = num3;
		//numeros[3] = num4;
		//numeros[4] = num5;
		
		int[] numeros = {num1,num2,num3,num4,num5};
		
		/*int numeroMax = 0; 
		
		for(int i=0; i < numeros.length; i++) {
			if(numeros[i] > numeroMax) {
				numeroMax = numeros[i];
			}
		}*/
		
		int numeroMax = numeros[0];
		
		for(int i=1; i < numeros.length; i++) {
			if(numeros[i] > numeroMax) {
				numeroMax = numeros[i];
			}
		}
		
		System.out.println("El número maximo es: " +numeroMax);
		entrada.close();
	}

}
