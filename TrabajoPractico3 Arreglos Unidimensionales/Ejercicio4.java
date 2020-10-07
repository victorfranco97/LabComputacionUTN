/*
4. Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo 
 */
package ArraysUni;

import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arrayDecimales = new double[20];
        for (int i = 0; i < arrayDecimales.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " del array ");
            arrayDecimales[i] = sc.nextDouble();
        }
        double numeroMayor = 0;

        for (int i = 0; i < arrayDecimales.length; i++) {
            if (arrayDecimales[i] > numeroMayor) {
                numeroMayor = arrayDecimales[i];
               
            }
        }
        double numeroMenor = numeroMayor;

        for (int i = 0; i < arrayDecimales.length; i++) {
            if (arrayDecimales[i] < numeroMayor) {
                numeroMayor = arrayDecimales[i];
            }
        }
        System.out.println("El menor numero ingresado en el arreglo es: " + numeroMayor);
        System.out.println("El rango del arreglo es: " + (numeroMenor - numeroMayor));

    }
}


