/*
 ) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
ir comprobando que si es divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Trece {

    public static void main(String[] args) {
        int num;
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = x.nextInt();

        primo(num);

    }

    static void primo(int num) {
        int contador = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
            if (contador > 1) {
                System.out.println(num + " no es primo");
                break;
            }
        }
        if (contador < 2) {
            System.out.println(num + " es primo");
        }
    }

}
