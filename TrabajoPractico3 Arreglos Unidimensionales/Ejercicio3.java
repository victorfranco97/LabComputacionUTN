/*
3. Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado 
y crear una función que rellene el array o arreglo con los múltiplos de un 
numero pedido por teclado. Por ejemplo, si defino un array de tamaño 5 
y elijo un 3 en la función, el array contendrá 3, 6, 9, 12, 15.
Muéstralos por pantalla usando otra función distinta.
 */
package ArraysUni;

import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que desee para el array");
        int tamanoArray = sc.nextInt();

        int[] arrayMultiplos = new int[tamanoArray];
        rellena(arrayMultiplos);
        imprime(arrayMultiplos);
    }

    public static void rellena(int array[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el numero del cual se rellenara el array con sus multiplos");
        int numMultiplos = x.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = (numMultiplos * i);
        }
    }    
    public static void imprime(int array[]) {
    for (int i = 0; i < array.length; i++) {
            System.out.println("El contenido del array: " +array[i]);
        }
    

}
}

