package cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tipo de cliente
        System.out.println("Ingrese el tipo de cliente (Normal, Socio, VIP) ");
        String tipoCliente = scanner.nextLine();

        // Pedir importe de la compra
        System.out.println("Ingrese el importe de la compra: ");
        double importe = scanner.nextDouble();

        double pagar = importe;

        // Calcular descuento según el tipo de cliente
        switch (tipoCliente) {
            case "Socio":
                pagar = importe * 0.95; // Descuento del 5%
                break;
            case "VIP":
                pagar = importe * 0.80; // Descuento del 20%
                break;
            case "Normal":
                // Sin descuento
                break;
        }

        // Mostrar total a pagar
        System.out.println("TOTAL: " +pagar);
       
        scanner.close();
    }
}
