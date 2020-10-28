package tp5.colecciones;

import java.util.ArrayList;

public class Matriz {
	static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
	
	public static void ImprimirLista() {
		for (Celda celda : matrizCuadrada) {
			System.out.println("Valor: " + celda.valor + " Fila: " + celda.fila + " Columna: " + celda.columna);
		}
		System.out.println();
	}
	public static String BuscarValorEnPosicion(int fila, int columna) {
		int longitudArray = matrizCuadrada.size();
		boolean seEncontro = false;
		String resultado = "";
		
		for (int i = 0; i < longitudArray - 1; i++) {
			if (matrizCuadrada.get(i).fila == fila && matrizCuadrada.get(i).columna == columna) {
				seEncontro = true;
				resultado = matrizCuadrada.get(i).valor;
			}
		}
		if (seEncontro == false) {
			resultado = "La fila y columna indicada no ha sido asignada";
		}
		return resultado;
	}
	
	
}
