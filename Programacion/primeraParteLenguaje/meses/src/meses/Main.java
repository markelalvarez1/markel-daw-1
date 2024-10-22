package meses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] meses = {
            "Enero", 
            "Febrero", 
            "Marzo", 
            "Abril", 
            "Mayo", 
            "Junio", 
            "Julio", 
            "Agosto", 
            "Septiembre", 
            "Octubre", 
            "Noviembre", 
            "Diciembre"
        };

        System.out.println("Ingresa el número del mes (1-12):");
        int mes = entrada.nextInt();
        
     
        if (mes >= 1 && mes <= 12) {
            System.out.println(meses[mes - 1]);
        } else {
            System.out.println("Ese mes no existe");
        }
    
        entrada.close();
    }
}

