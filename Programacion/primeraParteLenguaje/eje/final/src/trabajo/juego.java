package trabajo;

public class juego {

    public static void main(String[] args) {
        int Filas = 20;
        int Columnas = 20; 
        int[][] matriz = new int[Filas][Columnas];
    
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
            	if (Math.random() < 0.3) {
            	    matriz[i][j] = 1; 
            	} else {
            	    matriz[i][j] = 0;
            	}
            }
        }
        
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                System.out.print((matriz[i][j] == 1)  ? "." : "");
            }
            System.out.println();
        }
        
    
    }
}
