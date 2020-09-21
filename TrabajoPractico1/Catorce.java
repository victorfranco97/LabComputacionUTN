/*
14) Codifique un programa de consola en Java que permita realizar las siguientes acciones:
Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
int x = new Double(Math.random() * 100).intValue();
Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
para lograrlo.

 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Catorce {

    public static void main(String[] args) {

        int numero, intentos;
        Scanner x = new Scanner(System.in);

        int o = new Double(Math.random() * 100).intValue();

        intentos = 0;
        do {
            System.out.println("Ingrese un numero entre 0 y 100");
            System.out.print("Numero ingresado = ");
            numero = x.nextInt();

            if (numero < o) {
                System.out.println("Es muy bajo");
            } else {
                System.out.println("Es muy alto");
            }
            intentos++;
        } while (numero != o);

        System.out.println("Correcto, numero encontrado, cantidad de intentos " + intentos);

    }

}
