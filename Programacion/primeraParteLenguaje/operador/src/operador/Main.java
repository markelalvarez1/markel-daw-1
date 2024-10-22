package operador;

public class Main {

	public static void main(String[] args) {
	
		/*Operadores aritmeticos*/
		// + Sirve para sumar dos valores
		int n1 = 3;
		int n2 = 4;
		
		int suma = n1+n2;
		System.out.println(suma);
		System.out.println(n1+n2);
		
		int n3 = 6;
		float n4 = 3.5f;
		
		System.out.println(n3+n4);
		
		// - Sirve para restar dos valores
		int n5 = 33;
		int n6 = 22;
		
		System.out.println(n5-n6);
		
		// / 
		int n7 = 112;
		float n8 = 45f;
		
		System.out.println(n7/n8);
		
		// *
		int n9 = 10;
		int n10 = 5;
		
		System.out.println(n9*n10);
		
		// % Te da el resto de una division
		int n11 = 345;
		int n12 = 235;
		
		System.out.println(n11%n12);
		
		// ++
		System.out.println("INCREMENTO");
		int n13 = 8;
		n13 = n13 + 1;
		n13++;
		System.out.println(n13);
		
		// --
		System.out.println("DECREMENTO");
		n13 = n13 - 1;
		n13--;
		System.out.println(n13);
		
		/*Operadores relacionales*/
		
		//==
		System.out.println(1==1); //true
		System.out.println(1==2); //falso
		
		//!=
		System.out.println(1!=1); //false
		System.out.println(1!=2); //true
		
		//>
		System.out.println(1 > 0); //true
		System.out.println(1 > 1); //false
		System.out.println(1 > 2); //false
		
		//<
		System.out.println(1 < 0); //false
		System.out.println(1 < 1); //false
		System.out.println(1 < 2); //true
		
		//>=
		System.out.println(1 >= 0); //true
		System.out.println(1 >= 1); //true
		System.out.println(1 >= 2); //false
		
		//<=
		System.out.println(1 <= 0); //false
		System.out.println(1 <= 1); //true
		System.out.println(1 <= 2); //true
		
		/*Operadores logicos*/
		
		//&&
		System.out.println(1 < 0 && 1 < 2); //false
		
		//||
		System.out.println(1 < 0 || 1 < 2); //true
		
		//!
		System.out.println(!(1 <= 0)); //true
		System.out.println(!(1 <= 1)); //false
		
	}

}
