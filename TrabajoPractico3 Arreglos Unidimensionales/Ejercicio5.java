/*
5. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
package ArraysUni;

import java.util.Random;

/**
 *
 * @author victorfranco
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Random numRandom = new Random();
        int numero;
        int arregloPares[] = new int[20];

        int total = 0;

        for (int i = 0; i < arregloPares.length; i++) {
            numero = numRandom.nextInt(101);
            if (numero == 0) {
                arregloPares[i] = 2;
            } else if (numero % 2 != 0) {
                arregloPares[i] = numero + 1;
            } else {
                arregloPares[i] = numero;
            }
            total += numero;
        }

        double mediaAritmetica = total / arregloPares.length;

        
        System.out.println("El array se compone de los siguientes numeros:");
        for (int i = 0; i < arregloPares.length; i++) {
            if (i == (arregloPares.length - 1)) {
                System.out.println(arregloPares[i]);
            } else {
                System.out.print(arregloPares[i] + " - ");
            }
        }

        int contadorMedia = 0;
        int contadorMayoresMedia = 0;
        int contadorMenoresMedia = 0;
        for (int i = 0; i < arregloPares.length; i++) {
            if (arregloPares[i] == mediaAritmetica) {
                contadorMedia++;
            } else if (arregloPares[i] > mediaAritmetica) {
                contadorMayoresMedia++;
            } else {
                contadorMenoresMedia++;
            }
        }

        
        if (contadorMedia > 0) {
            System.out.println("Hay " + contadorMedia + " numero/s igual/es a la media aritmetica");
        } else {
            System.out.println("No hay numeros iguales a la media aritmetica");
        }

        if (contadorMayoresMedia > 0) {
            System.out.println("Hay " + contadorMayoresMedia + " numeros mayores a la media aritmetica");
        } else {
            System.out.println("No hay numeros mayores a la media aritmetica");
        }

        if (contadorMenoresMedia > 0) {
            System.out.println("Hay " + contadorMenoresMedia + " numeros menores a la media aritmetica");
        } else {
            System.out.println("No hay numeros menores a la media aritmetica");
        }
    }
}
