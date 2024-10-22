package parimpar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int Pares = 0;
        int Impares = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el " + (i + 1) + "º número:");
            numeros[i] = entrada.nextInt();
        }

        
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                Pares++;
            } else {
                Impares++;
            }
        }

       
        System.out.println("Cantidad de números pares: " + Pares);
        System.out.println("Cantidad de números impares: " + Impares);

        entrada.close();
    }
}

