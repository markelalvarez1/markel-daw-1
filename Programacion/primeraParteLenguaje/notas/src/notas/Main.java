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

        /*System.out.println("Introduce la 1ª nota:");
        nota[0] = entrada.nextDouble();

        System.out.println("Introduce la 2ª nota:");
        nota[1] = entrada.nextDouble();

        System.out.println("Introduce la 3ª nota:");
        nota[2] = entrada.nextDouble();

        System.out.println("Introduce la 4ª nota:");
        nota[3] = entrada.nextDouble();

        System.out.println("Introduce la 5ª nota:");
        nota[4] = entrada.nextDouble();

        System.out.println("Introduce la 6ª nota:");
        nota[5] = entrada.nextDouble();

        System.out.println("Introduce la 7ª nota:");
        nota[6] = entrada.nextDouble();

        System.out.println("Introduce la 8ª nota:");
        nota[7] = entrada.nextDouble();

        System.out.println("Introduce la 9ª nota:");
        nota[8] = entrada.nextDouble();

        System.out.println("Introduce la 10ª nota:");
        nota[9] = entrada.nextDouble();*/

        for(int i=0; i<asignaturas.length; i++) {
        	System.out.println("Introduce una nota para la asigantura" +asignaturas[i] +" es" + nota[i]);
        }

        double media = suma / nota.length;
        System.out.println("La media es: " + media);
        
        entrada.close();
    }
}

