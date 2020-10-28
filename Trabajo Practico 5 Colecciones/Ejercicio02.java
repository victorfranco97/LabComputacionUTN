package tp5.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> list1 = new ArrayList<Double>();
		
		for (int i = 0; i < 19; i++) {
			System.out.println("Ingrese un numero: ");
			list1.add(sc.nextDouble());
		}
		sc.nextLine();
		
		System.out.println("El mayor es: " + MayorDoubleList(list1));
		
		
		
		
	}
	
	public static double MayorDoubleList(ArrayList<Double> list) {
		double mayor = 0;
		for (int i = 0; i < list.size(); i++) {
			double actual = list.get(i);
			if (actual > mayor) {
				mayor = actual;
			}
		}
		return mayor;
	}

}
