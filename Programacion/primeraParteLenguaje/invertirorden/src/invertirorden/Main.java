package invertirorden;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        int[] numerosAlReves = new int[numeros.length];
        int j = 0; // 
        for (int i = numeros.length - 1; i >= 0; i--, j++) {
            numerosAlReves[j] = numeros[i];
        }

        System.out.println("Números en orden inverso:");
        for (int n : numerosAlReves) {
            System.out.print(n + " ");
        }

        entrada.close();
    }
}
