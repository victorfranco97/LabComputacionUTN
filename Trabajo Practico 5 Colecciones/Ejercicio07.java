package tp5.colecciones;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String valorCelda;
		Matriz matriz1 = new Matriz();
		do {
			System.out.println("Ingrese un valor para la celda o FIN para salir: ");
			valorCelda = sc.nextLine();
			if (valorCelda.equalsIgnoreCase("FIN")) {
				break;
			}
			System.out.println("Ingrese la fila:");
			int filaCelda  = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int columnaCelda = sc.nextInt();
			Celda celda1 = new Celda();
			celda1.valor = valorCelda;
			celda1.fila = filaCelda;
			celda1.columna = columnaCelda;
			matriz1.matrizCuadrada.add(celda1);
			sc.nextLine();
		} while (valorCelda != "FIN");
		matriz1.ImprimirLista();
		System.out.println("El valor en la fila 1, columna 1 es: " + matriz1.BuscarValorEnPosicion(1, 1));
	}

}
