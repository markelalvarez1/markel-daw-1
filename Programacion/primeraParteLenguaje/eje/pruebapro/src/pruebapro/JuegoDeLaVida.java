package pruebapro;

import java.util.Random;

public class JuegoDeLaVida {
    private static final int FILAS = 20;
    private static final int COLUMNAS = 20;
    private static int[][] tablero = new int[FILAS][COLUMNAS];

    public static void main(String[] args) {
        inicializarTableroAleatorio();
        while (true) {
            mostrarTablero();
            actualizarTablero();
            pausar(500); // Pausa de 500 milisegundos
        }
    }

    private static void inicializarTableroAleatorio() {
        Random random = new Random();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = random.nextInt(2); // 0 o 1
            }
        }
        // Estado inicial válido
        tablero[1][1] = 1; 
        tablero[1][2] = 1; 
        tablero[2][1] = 1; 
    }

    private static void mostrarTablero() {
        // Limpiar la consola (opcional, para mejor visualización)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] == 1 ? "." : " "); // Representar 1 como un punto
            }
            System.out.println();
        }
    }

    private static int contarVecinosVivos(int fila, int columna) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Ignorar la celda actual
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                if (nuevaFila >= 0 && nuevaFila < FILAS && nuevaColumna >= 0 && nuevaColumna < COLUMNAS) {
                    count += tablero[nuevaFila][nuevaColumna]; // Sumar 1 si hay un vecino vivo
                }
            }
        }
        return count;
    }

    private static void actualizarTablero() {
        int[][] nuevoTablero = new int[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (tablero[i][j] == 1) {
                    nuevoTablero[i][j] = (vecinosVivos == 2 || vecinosVivos == 3) ? 1 : 0;
                } else {
                    nuevoTablero[i][j] = (vecinosVivos == 3) ? 1 : 0;
                }
            }
        }
        tablero = nuevoTablero;
    }

    private static void pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos); // Pausa para la visualización
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

