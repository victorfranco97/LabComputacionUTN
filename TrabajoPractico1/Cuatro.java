/*
4) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

 */
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author VictorFranco
 */
public class Cuatro {
    public static void main(String[] args) {
        int num1, num2;
        Scanner x= new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        num1 = x.nextInt();
        System.out.println("Segundo numero");
        num2 = x.nextInt();
        
        if (num1>num2){
        System.out.println("El primer numero es mayor que el segundo");
            }else if (num1==num2){
            System.out.println("Los dos numeros son iguales");
                    }else {
                     System.out.println("El segundo numero es mas grande que el primero");
            }
    }
}
