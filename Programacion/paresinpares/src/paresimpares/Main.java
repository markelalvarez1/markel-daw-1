package paresimpares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int num = entrada.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        
        entrada.close();
    }
}
