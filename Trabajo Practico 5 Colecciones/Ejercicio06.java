package tp5.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Ingrese 10 enteros a la lista.");
		int line, contador = 0;
		do {
			System.out.println("Ingrese un entero: ");
			line = sc.nextInt();
			list1.add(line);
			contador++;
		} while (contador < 10);
		ImprimirLista(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		CopiarArrayList(list1, list2);
		CopiarArrayList(list1, list3);
		CopiarArrayList(list1, list4);
		CopiarArrayList(list1, list5);
		//Opcion 1
		System.out.println("Metodos desarrollados: ");
		OrdenarBurbuja(list2, "ASC");
		OrdenarBurbuja(list3, "DESC");
		ImprimirLista(list2);
		ImprimirLista(list3);
		//Opcion 2
		System.out.println("Metodo sort de Collections: ");
		Collections.sort(list4);
		Collections.sort(list5, Collections.reverseOrder());
		ImprimirLista(list4);
		ImprimirLista(list5);
		
	}
	public static void ImprimirLista(ArrayList<Integer> lista) {
		for (Integer integer : lista) {
			System.out.print(integer + " - ");
		}
		System.out.println();
	}
	public static void OrdenarBurbuja(ArrayList<Integer> listaDeElementos, String orden) {
		int longitudArray = listaDeElementos.size();
		boolean intercambio;
		do {
			intercambio = false;
			if (orden.equals("ASC")) {
				for (int i = 0; i < longitudArray -1; i++) {
					if (listaDeElementos.get(i) > listaDeElementos.get(i+1) ) {
						int aux = listaDeElementos.get(i+1);
						listaDeElementos.set(i+1, listaDeElementos.get(i));
						listaDeElementos.set(i, aux);
						intercambio = true;
					}
				}
			}else if (orden.equals("DESC")) {
				for (int i = 0; i < longitudArray -1; i++) {
					if (listaDeElementos.get(i) < listaDeElementos.get(i+1) ) {
						int aux = listaDeElementos.get(i+1);
						listaDeElementos.set(i+1, listaDeElementos.get(i));
						listaDeElementos.set(i, aux);
						intercambio = true;
					}
				}
			}
		} while (intercambio == true);
	}
	public static void CopiarArrayList(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		int contador = 0;
		for (Integer integer : array1) {
			array2.add(array1.get(contador));
			contador++;
		}
	}

}
