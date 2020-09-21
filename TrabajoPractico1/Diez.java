/*
10) Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
lo volverá a pedir (do while), después muestra ese número por consola
 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Diez {

    public static void main(String[] args) {

        int num;
        Scanner x = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero mayor a cero");
            num = x.nextInt();
        } while (num < 0);
        System.out.println("Su numero es " + num);
    }

}
