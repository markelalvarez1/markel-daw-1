package notas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] asignaturas = {"Historia", "Matematicas", "Fisica", "Euskera", "Lengua", "Tecnologia", "Filosofia","Gimnasia", "Ingles", "Biologia"};
        Double[] nota = new Double[asignaturas.length];
        
        double suma = 0;
        
        for(int i=0; i<10; i++) {
        	System.out.println("Introduce una nota para la asignatura " + asignaturas[i] + ":");
        	nota[i] = entrada.nextDouble();
        	suma = suma + nota[i];
        }

        /*System.out.println("Introduce la 1� nota:");
        nota[0] = entrada.nextDouble();

        System.out.println("Introduce la 2� nota:");
        nota[1] = entrada.nextDouble();

        System.out.println("Introduce la 3� nota:");
        nota[2] = entrada.nextDouble();

        System.out.println("Introduce la 4� nota:");
        nota[3] = entrada.nextDouble();

        System.out.println("Introduce la 5� nota:");
        nota[4] = entrada.nextDouble();

        System.out.println("Introduce la 6� nota:");
        nota[5] = entrada.nextDouble();

        System.out.println("Introduce la 7� nota:");
        nota[6] = entrada.nextDouble();

        System.out.println("Introduce la 8� nota:");
        nota[7] = entrada.nextDouble();

        System.out.println("Introduce la 9� nota:");
        nota[8] = entrada.nextDouble();

        System.out.println("Introduce la 10� nota:");
        nota[9] = entrada.nextDouble();*/

        for(int i=0; i<asignaturas.length; i++) {
        	System.out.println("Introduce una nota para la asigantura" +asignaturas[i] +" es" + nota[i]);
        }

        double media = suma / nota.length;
        System.out.println("La media es: " + media);
        
        entrada.close();
    }
}

