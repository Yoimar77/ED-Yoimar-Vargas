package ejecutables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class EjecutableEstructurasLineales {
	public static void main(String[] args) {
		ArrayList<String> ciudades = new ArrayList<>();
		LinkedList<String> nombres = new LinkedList<>();
		PriorityQueue<String>turnos = new PriorityQueue<>();
		Stack<String> pila= new Stack<>();
		HashMap<String, String> diccionario = new HashMap<>();
		
		ciudades.add("Jamundí");
		ciudades.add("Pereira");
		ciudades.add("Armenia");
		ciudades.add(1,"Cartagena");
		
		for (String city : ciudades) {
			System.out.println(city);
		}
		LinkedList<String>matriz=consumirMatriz(construirMatriz());
	}


	private static String [][] construirMatriz() {
		String [][] matriz = new String [2][2];
		matriz[0][0]="uno";
		matriz[0][1]="dos";
		matriz[1][0]="tres";
		matriz[1][1]="cuatro";
		return matriz;
	}
	private static LinkedList<String> consumirMatriz(String[][] matriz) {
		LinkedList<String>lista = new LinkedList<>();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				lista.add(matriz[i][j]);
				System.out.println(matriz[i][j]);
			}
			
		}
		return lista;
	}
	
}
