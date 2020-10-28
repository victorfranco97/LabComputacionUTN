package tp5.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Ingrese los valores al ArrayList, para salir"
				+ " ingrese un numero negativo.");
		
		Integer userNum1 = 0;
		
		while (userNum1.intValue() >= 0) {
			System.out.println("Ingrese numero: ");
			userNum1 = sc.nextInt();
			if (userNum1 >= 0) {
				list1.add(userNum1);
			}			
		}		
		for (Integer integer : list1) {
			System.out.print(integer + " - ");
		}
		
	}

}
