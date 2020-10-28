package tp5.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		int contador = 0;
		while (contador < 50) {
			int numeroAleatorio = (int) (Math.random() * 100) + 1;
			if (numeroAleatorio > 0 && numeroAleatorio % 2 == 0) {
				list1.add(numeroAleatorio);
				contador++;
			}
		}
		ImprimirLista(list1);
		System.out.println("Ingrese el entero a buscar en el array list: ");
		int elementoBuscado = sc.nextInt();
		sc.nextLine();
		BusquedaSecuencial(list1, elementoBuscado);
	}
	public static boolean BusquedaSecuencial(ArrayList<Integer> listaDeElementos, int elementoBuscado) {
		int longitudArray = listaDeElementos.size();
		boolean seEncontro = false;
		int posicion = -1;
		for (int i = 0; i < longitudArray - 1; i++) {
			if (listaDeElementos.get(i) == elementoBuscado) {
				seEncontro = true;
				posicion = i;
				break;
			}
		}
		if (seEncontro == false) {
			System.out.println("No se encontro el elemento buscado.");
		}else {
			System.out.println("Se encontro en la posicion: " + posicion);
		}
		return seEncontro;
	}
	public static void ImprimirLista(ArrayList<Integer> lista) {
		for (Integer integer : lista) {
			System.out.print(integer + " - ");
		}
		System.out.println();
	}

}
