import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Intoduce tu Nombre");
		String nombre = entrada.next();
	
		
		System.out.println("Intoduce 1� nota");
		Double numero = entrada.nextDouble();
		
		System.out.println("Intoduce 2� nota");
		Double numero1 = entrada.nextDouble();
		
		System.out.println("Intoduce 3� nota");
		Double numero2 = entrada.nextDouble();
		
		System.out.println("Intoduce 4� nota");
		Double numero3 = entrada.nextDouble();
		
		System.out.println("Intoduce 5� nota");
		Double numero4 = entrada.nextDouble();
		
		double media = (numero + numero1 + numero2 + numero3 + numero4) / 5;
		System.out.println("Tu media es: " + media);
		
		if (numero1>5 && numero2>5 && numero3>5 && numero4>5) {

		if (media>=5)
			System.out.println("El alumno " +nombre+" tiene una media de " +media+ " y es apto. ");
		} else {
			System.out.println("El alumno " +nombre+" tiene una media de "  +media+  " y no es apto ya que no tiene todas las asignaturas aptas. ");
		}
		entrada.close();
	}
	
}

