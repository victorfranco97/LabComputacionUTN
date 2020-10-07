package tpn3;

import java.lang.reflect.Array;
import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*Escriba una aplicaci�n para almacenar aleatoriamente 20 n�meros enteros positivos pares
		del 1 al 100, de los cuales se desea saber:
		a) su promedio aritm�tico
		b) cu�ntos de los n�meros son iguales al promedio aritm�tico
		c) cu�ntos de los n�meros son mayores que el promedio aritm�tico
		d) cu�ntos de los n�meros son menores que el promedio aritm�tico 
		 */
		
		Random numRandom = new Random();
		int numero;
		int arrayNumsPares [] = new int[20];
		int contNumsMedia = 0;
		int contNumsMayoresMedia = 0;
		int contNumsMenoresMedia = 0;
		int total = 0;
		double mediaAritmetica;
		
		//Lleno el array de n�meros pares (si da 0 le asigno 2, si da impar le sumo 1, si da par el asigno ese n�mero
		for(int i=0; i<arrayNumsPares.length;i++) {
			numero = numRandom.nextInt(101);
			if(numero==0) arrayNumsPares[i] = 2;
			else if(numero%2!=0) arrayNumsPares[i] = numero+1;
			else arrayNumsPares[i] = numero;
			total+=numero;
		}
		
		//Calculo la media aritm�tica
		mediaAritmetica=total/arrayNumsPares.length;
		
		//Muestro el array
		System.out.println("El array se compone de los siguientes n�meros:");
		for(int i=0; i<arrayNumsPares.length;i++) {
			if(i==(arrayNumsPares.length-1)) System.out.println(arrayNumsPares[i]);
			else System.out.print(arrayNumsPares[i] + " - ");
		}
		
		//Contabilizo los n�meros iguales, mayores y menores a la media;
		for(int i=0; i<arrayNumsPares.length;i++) {
			if(arrayNumsPares[i]==mediaAritmetica) contNumsMedia++;
			else if(arrayNumsPares[i]>mediaAritmetica) contNumsMayoresMedia++;
			else contNumsMenoresMedia++;
		}
		
		//Muestro la informaci�n
		if(contNumsMedia>0) System.out.println("Hay " + contNumsMedia + " n�mero/s igual/es a la media aritm�tica");
		else System.out.println("No hay n�meros iguales a la media aritm�tica");
		
		if(contNumsMayoresMedia>0) System.out.println("Hay " + contNumsMayoresMedia + " n�meros mayores a la media aritm�tica");
		else System.out.println("No hay n�meros mayores a la media aritm�tica");
		
		if(contNumsMenoresMedia>0) System.out.println("Hay " + contNumsMenoresMedia + " n�meros menores a la media aritm�tica");
		else System.out.println("No hay n�meros menores a la media aritm�tica");
		
	}

}
