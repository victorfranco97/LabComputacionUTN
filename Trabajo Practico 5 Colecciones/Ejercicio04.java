package tp5.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		System.out.println("Ingrese palabras a la lista, para terminar ingrese salir.");
		String line;
		do {
			System.out.println("Ingrese una palabra: ");
			line = sc.nextLine();
			if (!line.equalsIgnoreCase("salir")) {
				list1.add(line);
			}			
		} while (!line.equalsIgnoreCase("salir"));
		System.out.println("Las palabras ingresadas son: ");
		ImprimirLista(list1);
		System.out.println("La palabra con más caracteres es: " + MasCaracteresEnLista(list1));
		System.out.print("Existen palabras duplicadas en la lista: ");
		if (ExistenDuplicadosEnLista(list1)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		System.out.println("Las palabras duplicadas son: ");
		ImprimirDuplicadosEnLista(list1);
		
	}
	
	public static void ImprimirLista(ArrayList<String> lista) {
		for (String string : lista) {
			System.out.print(string + " - ");
		}
		System.out.println();
	}
	public static String MasCaracteresEnLista(ArrayList<String> lista) {
		String resultado = "";
		for (String string : lista) {
			if (string.length() > resultado.length()) {
				resultado = string;
			}
		}
		return resultado;
	}
	public static String MasCaracteresEnLista2(ArrayList<String> lista) {
		String resultado = "";
		for (String string : lista) {
			if (string.length() > resultado.length()) {
				resultado = string;
			}
		}
		return resultado;
	}
	public static boolean ExistenDuplicadosEnLista(ArrayList<String> lista) {
        HashSet<String> listaSet = new HashSet<String>(lista);
        if(listaSet.size()< lista.size()) {
            return true;
        }
        return false;
	}
	public static void ImprimirDuplicadosEnLista(ArrayList<String> lista) {
        if (ExistenDuplicadosEnLista(lista)) {
        	HashSet<String> listaSet = new HashSet<String>();
        	HashSet<String> duplicadosSet = new HashSet<String>();
        	for (String string : lista) {
				if (!listaSet.add(string)) {
					duplicadosSet.add(string);
				}
			}
        	ArrayList<String> duplicados = new ArrayList<String>(duplicadosSet);
        	for (String string : duplicados) {
        		System.out.print(string + " - ");
			}
        	System.out.println();
        	for (int i = 0; i < duplicadosSet.size(); i++) {
        		System.out.println(duplicados.get(i) + " se repite " + Collections.frequency(lista, duplicados.get(i))
        		+ " veces." );
			}
		}
	}
	

}
