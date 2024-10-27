package Ejercicio3Repaso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántas posiciones quieres que contenga tu array?");
        int numPosiciones = entrada.nextInt();
        int[] numeros = new int[numPosiciones];

        System.out.println("1.- Con ceros\n2.- Con números aleatorios del 1 al 100\n3.- Insertando los números manualmente.");
        int eleccion = entrada.nextInt();

        // Llenado inicial del array según elección
        switch (eleccion) {
            case 1:
                System.out.println("Llenando array con ceros...");
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = 0;  // Llena el array con ceros
                }
                System.out.print("Array generado: ");
                mostrarArray(numeros);  // Muestra el array generado
                break;
            case 2:
                System.out.println("Llenando array con números aleatorios...");
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = (int) (Math.random() * 100 + 1);  // Números aleatorios entre 1 y 100
                }
                System.out.print("Array generado: ");
                mostrarArray(numeros);  // Muestra el array generado
                break;
            case 3:
                System.out.println("Introduce los números que deseas:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = entrada.nextInt();  // Permite al usuario insertar los números manualmente
                }
                System.out.print("Array generado: ");
                mostrarArray(numeros);  // Muestra el array generado
                break;
            default:
                System.out.println("Opción no válida. Las opciones son 1, 2 o 3.");
                entrada.close();
                return;  // Sale del programa si la opción es inválida
        }

        // Menú de opciones para modificar el array
        while (true) {
            System.out.println("\n¿Qué quieres hacer con tu array?\n"
                    + "1.- Cambiar valores de todo el array\n"
                    + "2.- Cambiar un valor del array\n"
                    + "3.- Reiniciar el array\n"
                    + "4.- Mostrar Array\n"
                    + "5.- Suma\n"
                    + "6.- Multiplicación\n"
                    + "7.- Media\n"
                    + "8.- Factorial de cada valor\n"
                    + "9.- Ordenar de menor a mayor\n"
                    + "10.- Ordenar de mayor a menor\n"
                    + "0.- Salir");
            int eleccion2 = entrada.nextInt();

            switch (eleccion2) {
                case 1:
                    System.out.println("Introduce los nuevos valores:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        numeros[i] = entrada.nextInt();  // Cambia todos los valores del array
                    }
                    System.out.print("Array actualizado: ");
                    mostrarArray(numeros);  // Muestra el array actualizado
                    break;
                case 2:
                    System.out.println("¿Qué posición deseas cambiar? (0 a " + (numeros.length - 1) + "): ");
                    int posicion = entrada.nextInt();
                    if (posicion >= 0 && posicion < numeros.length) {
                        System.out.print("Introduce el nuevo valor: ");
                        numeros[posicion] = entrada.nextInt();  // Cambia un valor específico
                        System.out.print("Array actualizado: ");
                        mostrarArray(numeros);  // Muestra el array actualizado
                    } else {
                        System.out.println("Posición no válida.");
                    }
                    break;
                case 3:
                    System.out.println("Reiniciando el array...");
                    for (int i = 0; i < numeros.length; i++) {
                        numeros[i] = 0;  // Reinicia el array
                    }
                    System.out.print("Array reiniciado: ");
                    mostrarArray(numeros);
                    break;
                case 4:
                    System.out.print("Array actual: ");
                    mostrarArray(numeros);  // Muestra el array actual
                    break;
                case 5:
                    int suma = 0;
                    for (int num : numeros) {
                        suma += num;  // Calcula la suma de los elementos
                    }
                    System.out.println("La suma de los elementos del array es: " + suma);
                    break;
                case 6:
                    int producto = 1;
                    for (int num : numeros) {
                        producto *= num;  // Calcula el producto de los elementos
                    }
                    System.out.println("El producto de los elementos del array es: " + producto);
                    break;
                case 7:
                    int total = 0;
                    for (int num : numeros) {
                        total += num;  // Suma los elementos para calcular la media
                    }
                    double media = numeros.length > 0 ? (double) total / numeros.length : 0;  // Calcula la media
                    System.out.println("La media de los elementos del array es: " + media);
                    break;
                case 8:
                    System.out.println("Factorial de cada elemento del array:");
                    for (int num : numeros) {
                        System.out.println("Factorial de " + num + " = " + factorial(num));  // Muestra el factorial de cada elemento
                    }
                    break;
                case 9:
                    ordenarMenorAMayor(numeros);  // Ordena el array de menor a mayor
                    System.out.print("Array ordenado de menor a mayor: ");
                    mostrarArray(numeros);
                    break;
                case 10:
                    ordenarMayorAMenor(numeros);  // Ordena el array de mayor a menor
                    System.out.print("Array ordenado de mayor a menor: ");
                    mostrarArray(numeros);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    entrada.close();  // Cierra el escáner
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para mostrar el contenido del array
    private static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Método para calcular el factorial de un número
    private static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;  // Calcula el factorial
        }
        return resultado;
    }

    // Método para ordenar el array de menor a mayor
    private static void ordenarMenorAMayor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;  // Intercambia los elementos
                }
            }
        }
    }

    // Método para ordenar el array de mayor a menor
    private static void ordenarMayorAMenor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;  // Intercambia los elementos
                }
            }
        }
    }
}

