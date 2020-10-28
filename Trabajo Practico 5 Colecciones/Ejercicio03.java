package tp5.colecciones;
import java.util.ArrayList;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		int contador = 0;
		while (contador < 20) {
			int numeroAleatorio = (int) (Math.random() * 100) + 1;
			if (numeroAleatorio > 0 && numeroAleatorio % 2 == 0) {
				list1.add(numeroAleatorio);
				contador++;
			}
		}
		int promedio = PromedioAritmeticoLista(list1);
		System.out.println("El promedio aritmetico es: " + promedio );
		System.out.println("Cantidad de elementos iguales al promedio: " + CuantosIgualesList(promedio, list1));
		System.out.println("Cantidad de elementos mayores al promedio: " + CuantosMayoresList(promedio, list1));
		System.out.println("Cantidad de elementos menores al promedio: " + CuantosMenoresList(promedio, list1));
	}
	
	public static int PromedioAritmeticoLista(ArrayList<Integer> list) {
		int result = sumaLista(list) / list.size();
		return result;
	}
	public static int CuantosMayoresList(int num, ArrayList<Integer> list) {
		int contador = 0;
		for (Integer integer : list) {
			if (integer > num) {
				contador++;
			}
		}
		return contador;
	}
	public static int CuantosMenoresList(int num, ArrayList<Integer> list) {
		int contador = 0;
		for (Integer integer : list) {
			if (integer < num) {
				contador++;
			}
		}
		return contador;
	}
	public static int CuantosIgualesList(int num, ArrayList<Integer> list) {
		int contador = 0;
		for (Integer integer : list) {
			if (integer == num) {
				contador++;
			}
		}
		return contador;
	}
	public static int sumaLista (ArrayList<Integer> list) {
		int result = 0;
		for (Integer integer : list) {
			result += integer;
		}
		return result;
	}

}
