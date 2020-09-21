/*
5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
debemos indicarlo.
*/
package TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author VictorFranco
 */
public class Cinco {
    public static void main(String[] args) {
       int num;
       Scanner x = new Scanner (System.in);
      
       
        System.out.println("Ingrese un numero para vcer si es divisible por 2");
        num = x.nextInt();
        
        if (num %2 !=0){
            System.out.println("El numero NO es divisble por 2");
        } else {
            System.out.println("El numero SI es divisible por 2");
        }
                
    }
}
