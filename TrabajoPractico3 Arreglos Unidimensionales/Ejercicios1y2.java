/*
1. ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?


El compilador arroja ArrayIndexOutOfBoundsException para indicar que se ha 
accedido al array con un índice ilegal. El índice es negativo, mayor o igual 
que el tamaño del array.

2. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
 */
package ArraysUni;
import java.util.Scanner;

/**
 *
 * @author victorfranco
 */
public class Ejercicios1y2 {
    public static void main(String[] args) {
        int [] arreglo = new int [5];
        Scanner sc = new Scanner (System.in);
       for (int i = 0; i < arreglo.length; i++){
           System.out.println("Ingrese el numero " +(i+1)+ " para completa el array");
           arreglo [i] = sc.nextInt();
          }
        for (int j=0; j<arreglo.length;j++){
            System.out.println("El entero en la posicion "+(j+1)+" es de : " +arreglo[j]);
        }
    }
}
