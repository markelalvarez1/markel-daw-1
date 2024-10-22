package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Profesor();
		Persona p2 = new Alumno();
		
		String[] dias = new String[7];
		
		//Dar valor
		dias[0] = "Lunes";
		
		//Obtener valor
		System.out.println(dias[0]);
		
		//Obtener dimension del array
		System.out.println(dias.length);
				
		//Recorrer
		for(int i=0; i < dias.length; i++){
			System.out.println(dias[i]);
		}
		
		//ArrayList - implementa la interfaz List con lo que es un Iterable, Collection y List
		//Definicion
		ArrayList<String> lista = new ArrayList<String>();
		
		//Dar valor
		lista.add("Alberto");
		lista.add("Sergio");
		
		//Obtener valor
		System.out.println(lista.get(0));
		
		//Eliminar el valor
		lista.remove(0);
		
		//Obtener la dimension
		System.out.println(lista.size());
		
		//Recorrer
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
